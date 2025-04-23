package org.example;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

/* This class contains brute and optimal solutions that print the available pairs that add up to the given sum */
public class FindingPairs {
    protected void bruteSolution(int [] arr, int sum) {
        int n = arr.length;
        boolean found = false;
        for(int i = 0; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                if(arr[i]+arr[j] == sum) {
                    found = true;
                    System.out.println("Pair: {" + arr[i] + ", " + arr[j] + "}");
                }
            }
        }
        if(!found)
            System.out.println("No pairs found for the given sum.");
    }

    protected void optimalSolution(int [] arr, int sum) {
        int i = 0, j=arr.length-1;
        boolean found = false;
        Arrays.sort(arr);
        while(i<j) {
            if(arr[i]+arr[j] > sum) {
                j--;
            } else if(arr[i] + arr[j] == sum) {
                found = true;
                System.out.println("Pair: {" + arr[i] + ", " + arr[j] + "}");
                i++;
                j--;
            } else i++;
        }
        if(!found)
            System.out.println("No pairs found for the given sum.");
    }
}
