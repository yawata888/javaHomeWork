package javaHomeWork;

public class Homework3 {
    public static void main(String[] args){
        int[][] numbers = {
                {1, 40, 30},
                {4, 5, 6},
                {7, 80, 9}
        };
        System.out.println("Even numbers:");

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j]);
                }
            }
        }
        }

    }

