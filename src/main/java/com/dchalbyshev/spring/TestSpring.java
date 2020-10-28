package com.dchalbyshev.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;
//3
public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        //  данный класс получаем из спринга он счиывает все бины из ApplicationContext   и помещает в экземпляр
        // класса
        // имя файла должно совпадать и папка в котром лежит файл должна быть помечена как папка с ресурсами
       // Music music = context.getBean("musicBean",Music.class);
        // меняя класс в контексте в бине мы можем изменять класс создаваемого объекта
        // в предлах классов имплементящих интерфейс
        //указываем имя бина и к какому классу принадлежит указанный объект
       //MuiscPlayer mp = new MuiscPlayer(music);

       MuiscPlayer mp = context.getBean("musucPlayer",MuiscPlayer.class);
        mp.playMusic();
        context.close();


    }
}
