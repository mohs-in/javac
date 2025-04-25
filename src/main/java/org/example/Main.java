package org.example;

import org.game.Game;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the names of the 3 players: ");
        String p1 = scanner.nextLine();
        String p2 = scanner.nextLine();
        String p3 = scanner.nextLine();

        org.game.Game obj = new Game(p1, p2, p3);

        obj.start();
    }
}