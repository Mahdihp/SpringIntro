package com.other;

public class ServiceImplOne implements Service {

    @Override
    public void doSomthing() {
        System.out.println("call doSomthing from ServiceImplOne");
    }
}
