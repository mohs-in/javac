package org.example;

import java.util.EnumSet;
import java.util.Scanner;

public class StringBasics {
    void basics() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String largestString = "";
        int max = -1;
        scanner.nextLine();
        for(int i = 0; i < n; i ++) {
            String inp = scanner.nextLine();
            if(inp.length() > max) {
                max = inp.length();
                largestString = inp;
            }
        }
        System.out.println(largestString);


    }
}
