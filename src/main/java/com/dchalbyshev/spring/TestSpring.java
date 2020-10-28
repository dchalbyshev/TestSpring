package com.dchalbyshev.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//3
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //  данный класс получаем из спринга он счиывает все бины из ApplicationContext   и помещает в экземпляр
        // класса
        // имя файла должно совпадать и папка в котром лежит файл должна быть помечена как папка с ресурсами
        TestBean testBean = context.getBean("testBean",TestBean.class);
        //указываем имя бина и к какому классу принадлежит указанный объект
        System.out.println(testBean.getName());
        context.close();


    }
}
