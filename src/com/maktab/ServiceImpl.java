package com.maktab;


import org.springframework.stereotype.Component;

@Component
public class ServiceImpl implements Service {
    @Override
    public void getDailyWork() {
        System.out.println("call Service...");
    }
}
