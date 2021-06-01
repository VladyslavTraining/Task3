package main.practice3;


import java.util.Arrays;
import java.util.List;

public class GenericsTest {

    private static void upperBounded(List<? extends Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    private static void lowerBounded(List<? super Number> list) {
        for (Object num : list) {
            System.out.println(num);
        }
    }

    private static void unbounded(List<Number> list) {
        for (Number num : list) {
            System.out.println(num);
        }
    }

    /* Java generics uses type erasure, the bit in the angle brackets (<String> and <Number>) gets removed
         and so we have end up with two methods that have an identical signature*/
    private static void printList(List<String> list) { }

    private static void printList(List<Number> list) { }


    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<Object> objList = Arrays.asList("1", "2", 3);

        upperBounded(intList); //correct compile because conditions are correct, Integer is inherited from Number

        lowerBounded(intList); // error compile because lower bound is Number-class,therefore, the input parameter must be a Number class or higher in the hierarchy  */

        unbounded(intList); // error compile because the input parameter must be <Number> only

    }

}
