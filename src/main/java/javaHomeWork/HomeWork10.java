package javaHomeWork;
import java.util.*;

public class HomeWork10 {
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "orange", "apple", "grape", "banana", "kiwi"};

        Set<String> uniqueElements = new HashSet<>();
        Set<String> duplicateElements = new HashSet<>();

        for (String element : array) {
            if (!uniqueElements.add(element)) {
                duplicateElements.add(element);
            }
        }

        System.out.println("Duplicate elements in the array: " + duplicateElements);


    }
}