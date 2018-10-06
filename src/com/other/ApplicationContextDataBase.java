package com.other;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ApplicationContextDataBase {

    @Bean(initMethod = "init",destroyMethod = "destroy")
    @Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Service getServiceBean(){
        return new ServiceImpl();
    }

    @Bean
    public ServiceImplOne getServiceOneBean(){
        return new ServiceImplOne();
    }

    @Bean
    public ServiceImplTwo getServiceTwoBean(){
        return new ServiceImplTwo();
    }
}
