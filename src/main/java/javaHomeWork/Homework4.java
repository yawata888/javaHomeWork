package javaHomeWork;

public class Homework4 {
    public static void main(String[] args) {
        int[][] numbers = {
                {10, 12, 3},
                {45, 5, 6},
                {7, 8, 90}
        };
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    evenSum += numbers[i][j];
                } else {
                    oddSum += numbers[i][j];
                }

            }

        }
        System.out.println("Sum of even number:"+evenSum);
        System.out.println("Sum of odd numbers: "+oddSum);
    }
}