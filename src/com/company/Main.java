package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    static Random random = new Random();
    public static void main(String[] args) {
        ArrayList<Integer> oddNum = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            oddNum.add(random.nextInt(50));
        }
        for (int odd: oddNum) {
           if(odd % 2 == 1) {
               System.out.print("Odd numbers: " + odd + ", ");
           }
        }
        System.out.println();
        ArrayList<Integer> evenNum = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            evenNum.add(random.nextInt(50));
        }
        for (int even: evenNum) {
            if (even % 2 == 0) {
                System.out.print("Even numbers: " + even + ", ");
            }
        }

    }
}
