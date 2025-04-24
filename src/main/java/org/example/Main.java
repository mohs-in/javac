package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList obj = new ArrayList();
        java.util.ArrayList<Integer> result = obj.arrayList();

        for(Integer num: result) {
            System.out.println(num);
        }
    }
}