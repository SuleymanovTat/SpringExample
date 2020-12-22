package ru.suleymanovtat;

public class Player {

    private Music music;
    private int id;
    private String name;

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

    public void playMusic() {
        System.out.println("Play " + music.getSong());
    }
}
