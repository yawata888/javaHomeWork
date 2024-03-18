import java.util.Arrays;

public class HomeWork1 {

    public static void main(String[] args) {
        double[] temps = {65.6, 77, 88, 55.5, 77, 88, 90};
        Arrays.sort(temps);
        System.out.println("Lowest and Highest temps:");
        System.out.println(temps[0]);
        System.out.println(temps[6]);


    }
}