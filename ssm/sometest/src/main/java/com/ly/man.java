package com.ly;

import com.ly.impl.Bi2Impl;
import com.ly.impl.BiImpl;

public class man extends Person{
    private int len;

    public int getLen() {
        return len;
    }

    public void setLen(int len) {
        this.len = len;
    }

    @Override
    public void ml() {
        System.out.println("push...pop...");
    }

    public void use(){
        Bi ab2 = new Bi2Impl();
        Bi ab = new BiImpl();
        ab.write();
        ab2.write();
    }

}
