package com.dchalbyshev.spring;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")  //singleton
public class ClassicalMusic implements  Music{
    private ClassicalMusic(){};
    public  static ClassicalMusic getClassicalMusic(){
        return  new ClassicalMusic();
    }
    @Override
    public String getSong() {
        return "Rapsody";
    }
    @PostConstruct
    public  void  doMyInit(){
        System.out.println("my inizialization");

    }
    @PreDestroy
    public  void  doDestroy(){
        System.out.println("do destroy BeanApp");
    }

}
