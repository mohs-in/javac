package org.example;

public class Main {
    public static void main(String[] args) {
        int [] arr = {3, 5, 9, 7, 10, 11, 1};
        int sum = 16;

        FindingPairs obj = new FindingPairs();

        obj.optimalSolution(arr, sum);
    }
}