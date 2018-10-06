package com.other;

public class ServiceImplTwo implements Service {
    @Override
    public void doSomthing() {
        System.out.println("call doSomthing from ServiceImplTwo");
    }

    @Override
    public void init() {

    }

    @Override
    public void destroy() {

    }
}
