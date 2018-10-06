package com.other;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Mian {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
           new AnnotationConfigApplicationContext(ApplicationContext.class);
        SwimCoach bean = ctx.getBean(SwimCoach.class);
        bean.teaching();
        bean.callService();

        VolleyBallCoach bean2 = ctx.getBean(VolleyBallCoach.class);
        bean2.teaching();
        bean2.callService();
//        Class<SwimCoach> swimCoachClass = SwimCoach.class;

        ctx.close();
    }
}
