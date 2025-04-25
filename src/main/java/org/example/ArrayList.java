package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayList {

    // Without using Dynamic sizing
    int[] findOccurences(int [] arr, int element) {
        int n = arr.length;
        int [] rArr = new int[n];
        int idx = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == element) {
                rArr[idx] = i;
                idx++;
            }
        }
        int [] resultArr = new int[idx];
        for(int i = 0; i < resultArr.length; i++) {
            resultArr[i] = rArr[i];
        }

        return resultArr;
    }

    java.util.ArrayList<Integer> arrayList() {
        java.util.ArrayList<Integer> arrL = new java.util.ArrayList<>();
        arrL.add(10);
        arrL.add(20);
        arrL.add(30);
        arrL.add(0, 0);

        return arrL;
    }

    void multiDimensionArrayList() {
        java.util.ArrayList<java.util.ArrayList<Integer>> nestedArrayList = new java.util.ArrayList<java.util.ArrayList<Integer>>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the No. of Rows: ");
        int noOfRows = scanner.nextInt();
        for(int i = 0; i < noOfRows; i++) {
            nestedArrayList.add(new java.util.ArrayList<Integer>());
            System.out.println("Enter the no. of columns for the row: " + i);
            int noOfColumns = scanner.nextInt();
            for(int j = 0; j < noOfColumns; j++) {
                System.out.println("Enter value at " + i + ", " + j);
                int value = scanner.nextInt();
                nestedArrayList.get(i).add(value);
            }
        }

        for(int i = 0; i < nestedArrayList.size(); i++) {
            for(int j = 0; j < nestedArrayList.get(i).size(); j++) {
                System.out.print(nestedArrayList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }


}
