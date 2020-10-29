package com.dchalbyshev.spring;


import java.util.ArrayList;
import java.util.List;

public class MuiscPlayer {

    private List<Music> list = new ArrayList<>();
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

    public void setList(List<Music> list) {
        this.list = list;
    }

    public MuiscPlayer(List<Music> list) {
        this.list = list;
    }  // IOC внедряем зависимость
    public  void playMusic(){
        for (Music music: list){
            System.out.println( music.getSong());

        }
    }

    public void setMusic(Music music) {
        this.music = music;
    }
}
