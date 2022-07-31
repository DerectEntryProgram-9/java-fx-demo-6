import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {

        // 1:47:53 DEP Lecture 19_07_2022

        ArrayList<Integer> number1 = new ArrayList<>();
        number1.add(10);
        number1.add(5);
        number1.add(30);
        number1.add(25);
        number1.add(50);

        ArrayList<Integer> number2 = new ArrayList<>();
        number2.add(55);
        number2.add(61);
        number2.add(60);
        number2.add(45);
        number2.add(100);

        System.out.println(number1);
        // [10, 20, 30, 40, 50]

        System.out.println("-----------------------");

        number1.addAll(number2);
        System.out.println(number1);
        // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        // OR

//        for (Integer number : number2) {
//            number1.add(number);
//        }

        System.out.println("-----------------------");

        /* Arrays.sort = Collections.sort */

        System.out.println("Sort for dynamic array");
        Collections.sort(number1);  // Sort for dynamic array

        System.out.println(number1);
        System.out.println("-----------------------");

        System.out.println("Collections.binarySearch for 5");
        int i = Collections.binarySearch(number1, 5);
        System.out.println(i);

//        int[] numbers = {25, 35, 45};
//        ArrayList<Integer> number = (ArrayList<Integer>) Arrays.asList(25, 35, 45);

    }
}
