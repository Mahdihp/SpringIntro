package com.other;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mian {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(ApplicationContext.class);
        Coach bean = ctx.getBean(Coach.class);
        bean.teaching();
        bean.callService();
        ctx.close();
    }
}
