package com.maktab;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.SpringVersion;

public class SpringMainApp {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");
        Coach bean = (Coach) context.getBean("basketBall");
        bean.teaching();
        bean.callService();
        System.out.println(bean);
        System.out.println(SpringVersion.getVersion());


    }
}
