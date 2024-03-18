package javaHomeWork;
import java.util.Arrays;

public class HomeWork9 {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 7, 3, 15, 12};

        int secondLargest = findSecondLargest(numbers);

        System.out.println("Second largest number in the array: " + secondLargest);
    }
    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return Integer.MIN_VALUE;
        }
        Arrays.sort(arr);
        return arr[arr.length - 2];


    }
}