package com.ly.test;


import com.ly.pojo.account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)//指定spring帮跑
@ContextConfiguration("classpath:applicationContext.xml")
public class JdbcTemplateCRUD {

    @Autowired
    JdbcTemplate jdbcTemplate;
    //增删改都是update方法
    @Test
    //修改
    public void testUpdate(){
        jdbcTemplate.update("update account set money=? where name =?",1523362,"tom");
    }

    @Test
    //删除
    public void testDelete(){
        jdbcTemplate.update("delete from account where name=?","tom2");
    }

    @Test
    //增加
    public void testAdd(){
        jdbcTemplate.update("insert into account(name) values(?)","nimaw");
    }



    //BeanPropertyRowMapper用于把查询到的封装,如果返回的是实体则需要BeanPropertyRowMapper封装,如果是简单类型则不用

    @Test
    //查询全部
    public void testQueryAll(){
//        <>泛型中的类型为要封装到的实体的类型,同时()内要有该实体的.class
        List<account> accountList = jdbcTemplate.query("select * from account", new BeanPropertyRowMapper<account>(account.class));
        System.out.println(accountList);
    }

    @Test
    //查询一个对象
    public void testQueryOne(){
        account object = jdbcTemplate.queryForObject("select * from account where name=?", new BeanPropertyRowMapper<account>(account.class), "nima");
        System.out.println(object);
    }

    @Test
    //聚合查询
    //这里因为查出来的要一个数字,所以不用BeanPropertyRowMapper直接用int就行
    //查总记录数
    public void testQueryCount(){
        Long count = jdbcTemplate.queryForObject("select count(*) from account", long.class);
        System.out.println(count);

    }

    @Test
    //平均值
    public void testAverage(){

        Double object = jdbcTemplate.queryForObject("select avg(money) from account", double.class);
        System.out.println(object);
    }

}
