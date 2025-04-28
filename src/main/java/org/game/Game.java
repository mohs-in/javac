package org.game;

public class Game {
    private int expectedGuess;
    private boolean guessResult;
    Player p1, p2, p3;

    public Game(String name1, String name2, String name3) {
        p1 = new Player(name1);
        p2 = new Player(name2);
        p3 = new Player(name3);
    }

    private boolean checkGuess(Player p, int round) {
        if(p.getGuess() == expectedGuess) {
            System.out.println(p.name + " has won in round "+ (round-1));
            return true;
        }
        return false;
    }

    private void makeAllGuesses() {
        p1.makeGuess();
        p2.makeGuess();
        p3.makeGuess();
    }

    private void checkAllGuesses(int round) {
        guessResult = checkGuess(p1, round) | checkGuess(p2, round) | checkGuess(p3, round);
    }

    public void start() {
        System.out.println("Welcome to the Guessing game..." + p1.name +", "+p2.name+", "+p3.name);
        expectedGuess = (int)(Math.random()*10);
        System.out.println("Expected Guess: " + expectedGuess);
        int round = 1;
        while(!guessResult) {
            System.out.println();
            System.out.println("Round: " + round); round++;
            makeAllGuesses();
            checkAllGuesses(round);
        }
    }
}

