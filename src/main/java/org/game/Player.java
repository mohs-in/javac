package org.game;

public class Player {
    String name;
    private int guess;

    public Player(String name) {
        this.name = name;
    }

    public void makeGuess() {
        guess = (int)(Math.random()*10);
        System.out.println(name + " is guessing " + guess);
    }

    public int getGuess() {
        return guess;
    }
}
