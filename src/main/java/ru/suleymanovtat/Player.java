package ru.suleymanovtat;

public class Player {

    private final Music music;

    public Player(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Play " + music.getSong());
    }
}
