package com.test;

import com.ly.Bi;
import com.ly.Person;
import com.ly.impl.BiImpl;
import com.ly.man;

public class Test {
    public static void main(String[] args) {
        int eyes = Person.getEyes();
        System.out.println(eyes);
        man am = new man();
        am.use();
        am.ml();
        Person ap = new man();
        ap.ml();
        Person ap2 =new Person();
        ap2.ml();
        Test at =new Test();
        System.out.println("-------");
        at.JJ(new BiImpl());
    }


    public void JJ(Bi s){
        s.write();
    }

}
