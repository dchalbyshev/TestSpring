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


        MuiscPlayer mp = context.getBean("muiscPlayer",MuiscPlayer.class);
        System.out.println(mp.getVolume());
        System.out.println(mp.getName());
        ClassicalMusic cm = context.getBean("classicalMusic",ClassicalMusic.class);
        context.close();

       // ClassicalMusic cm2 = context.getBean("classicalMusic",ClassicalMusic.class);
       // System.out.println(cm == cm2);
      /* RockMusic rock = context.getBean("musicRockBean",RockMusic.class);
       ClassicalMusic classic = context.getBean("musicClassicBean",ClassicalMusic.class);

        System.out.println(rock.getSong());
        System.out.println(classic.getSong());*/
      /* MuiscPlayer mp = context.getBean("musucPlayer",MuiscPlayer.class);
        mp.playMusic();
        System.out.println( "name: " + mp.getName() + "\n" + "volume: "+  mp.getVolume());
        context.close();*/


    }
}
