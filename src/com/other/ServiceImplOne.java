package com.other;

public class ServiceImplOne implements Service {

    @Override
    public void doSomthing() {
        System.out.println("call doSomthing from ServiceImplOne");
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
