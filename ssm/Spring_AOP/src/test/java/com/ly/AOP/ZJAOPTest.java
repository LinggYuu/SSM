package com.ly.AOP;


import com.ly.ZjAOP.Target;
import com.ly.ZjAOP.TargetInterface;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)//指定测试引擎
@ContextConfiguration("classpath:applicationContext-anno.xml")
public class ZJAOPTest {
//要测target这个bean调用save方法有没有执行前置增强,这里搞了个接口，注入的是实现类bean
    @Autowired
    private TargetInterface target;


    @Test
    public void test1(){
        target.save();
    }


}
