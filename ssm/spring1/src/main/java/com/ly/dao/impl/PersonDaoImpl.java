package com.ly.dao.impl;

import com.ly.dao.PersonDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class PersonDaoImpl implements PersonDao {

    private String name;
    private int age;
    private ArrayList<String> list1;
    private List<String> list2;
    private Map<String,Pet> map;
    private Properties properties;

    public Map<String, Pet> getMap() {
        return map;
    }

    public void setMap(Map<String, Pet> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public ArrayList<String> getList1() {
        return list1;
    }

    public void setList1(ArrayList<String> list1) {
        this.list1 = list1;
    }

    public List<String> getList2() {
        return list2;
    }

    public void setList2(List<String> list2) {
        this.list2 = list2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void print(){
        System.out.println(this.name+"的年龄为"+this.age);
    }

    public void print2(){
        System.out.println(list1);
       System.out.println(list2);
        System.out.println(map);
        System.out.println(properties);
    }



}
