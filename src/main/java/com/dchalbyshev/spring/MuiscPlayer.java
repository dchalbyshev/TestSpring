package com.dchalbyshev.spring;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MuiscPlayer {

    private List<Music> list = new ArrayList<>();
   private Music music;
   @Value("${musicPlayer.name}") // берем значение из properties
   private String name;
   @Value("${musicPlayer.volume}")
   private  int  volume;

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public Integer getVolume() {
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
