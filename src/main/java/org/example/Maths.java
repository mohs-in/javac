package org.example;

/*
* Prime Numbers
* Divisors
* GCD
* AP
* GP
* P & C
* Fibonacci Series
* Log Function
* Math Class(in-built Functions)
*/

import java.util.Arrays;

public class Maths {

    // Check if the specified number is prime or not
    public boolean isPrime(int num) {
        for(int i = 2; i*i <= num; i++) {
            if(num%i == 0)
                return false;
        }
        return true;
    }

    // List all the prime numbers in the specified startRange and endRange
    public java.util.ArrayList<Integer> findPrimes(int startRange, int endRange) {
        java.util.ArrayList<Integer> result = new java.util.ArrayList<Integer>();

        for(int i = startRange; i < endRange; i++) {
            if(i == 1)
                continue;
            if(isPrime(i))
                result.add(i);
        }
        return result;
    }

    // List all the divisors of the specified number
    public java.util.ArrayList<Integer> findDivisors(int num) {
        java.util.ArrayList<Integer> result = new java.util.ArrayList<Integer>();

        // brute-approach
//        for(int i = 1; i <= num; i++) {
//            if(num%i == 0) {
//                result.add(i);
//            }
//        }

        // optimized-approach
        for(int i = 1; i*i <= num; i++) {
            if(num%i == 0) {
                result.add(i);
                result.add((int)(num/i));
            }
        }
        return result;
    }

    public int sumOfDivisors(int num) {
        int sum = 0;

        for(int i = 1; i*i <= num; i++) {
            if(num%i == 0) {
                if(i*i == num) {
                    sum += i;
                } else {
                    sum += i + num/i;
                }
            }
        }
        return sum;
    }

    public void infiniteGPSum() {
        float a = 2f, r = 0.5f, sum = 0f;

        while(a != 0) {
            sum += a;
            a *= r;
        }

        System.out.println(sum);
    }
}
