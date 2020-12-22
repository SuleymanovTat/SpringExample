package ru.suleymanovtat;

import java.util.List;

public class Player {

    private Music music;
    private int id;
    private String name;
    private List<Music> musicList;

    public Player() {
    }

    public Player(Music music) {
        this.music = music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Music> getMusicList() {
        return musicList;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        System.out.println("Play " + music.getSong());
    }

    @Override
    public String toString() {
        return musicList.getClass().getName();
    }
}
