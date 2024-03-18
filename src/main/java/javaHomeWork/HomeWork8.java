package javaHomeWork;
import java.util.Arrays;
public class HomeWork8 {
    public static void main(String[] args) {
        int[] array = {20,10,9,8,30,49,50 };

        Arrays.sort(array);
        int minValue = array[0];
        int maxValue = array[array.length - 1];

        System.out.println("Maximum value: " + maxValue);
        System.out.println("Minimum value: " + minValue);
    }
}