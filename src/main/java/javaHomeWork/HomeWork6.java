package javaHomeWork;

import java.util.Scanner;

public class HomeWork6 {
    public static void main(String[] args) {
        int num = 2;
        int i = 2;
        boolean flag = false;

        while (i <= num / 2) {

            if (num % i == 0) {
                flag = true;
                break;
            }
            ++i;
        }

        if (!flag)
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");

    }
}
