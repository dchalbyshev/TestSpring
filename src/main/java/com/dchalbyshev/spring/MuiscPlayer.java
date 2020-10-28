package com.dchalbyshev.spring;



public class MuiscPlayer {
   private Music music;

    public MuiscPlayer(Music music) {
        this.music = music;
    }  // IOC внедряем зависимость
    public  void playMusic(){
        System.out.println("Playing" +  music.getSong());
    }

}
