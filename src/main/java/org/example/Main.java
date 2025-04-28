package org.example;

public class Main {

    public static void main(String[] args) {
        Maths obj = new Maths();
        java.util.ArrayList<Integer> arrayList = new java.util.ArrayList<>();
        arrayList = obj.findDivisors(18);

        for(int num: arrayList) {
            System.out.print(num + " ");
        }

    }
}