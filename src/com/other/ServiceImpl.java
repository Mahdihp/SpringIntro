package com.other;

import org.springframework.stereotype.Component;

public class ServiceImpl implements Service {
    @Override
    public void doSomthing() {
        System.out.println("call doSomthing from ServiceImpl");
    }
}
