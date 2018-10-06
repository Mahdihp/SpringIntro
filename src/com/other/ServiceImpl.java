package com.other;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class ServiceImpl implements Service {

    @Override
    public void doSomthing() {
        System.out.println("call doSomthing from ServiceImpl");
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }


}
