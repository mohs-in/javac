package org.example;

import java.util.Arrays;

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


}
