package com.dchalbyshev.spring;



public class MuiscPlayer {
   private Music music;
   private String name;
   private  String volume;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public String getVolume() {
        return volume;
    }

    public MuiscPlayer() {
    }

    public MuiscPlayer(Music music) {
        this.music = music;
    }  // IOC внедряем зависимость
    public  void playMusic(){
        System.out.println("Playing" +  music.getSong());
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
