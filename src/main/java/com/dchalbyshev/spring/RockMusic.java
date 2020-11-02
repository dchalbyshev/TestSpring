package com.dchalbyshev.spring;

public class RockMusic implements  Music {
    @Override
    public String getSong() {
        return "Moskow Calling";
    }
    public  void  doMyInit(){
        System.out.println("my inizialization");

    }
    public  void  doDestroy(){
        System.out.println("do destroy BeanApp");
    }
}
