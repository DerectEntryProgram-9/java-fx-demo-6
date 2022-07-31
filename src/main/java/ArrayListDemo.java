import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {

        //        char -> Character
        //        boolean -> Boolean
        //        short -> Short
        //        int -> Integer
        //        long -> Long
        //        double -> Double
        //        float -> Float

        /* -------------------------------------------------------------------------------------------------------- */
        /* Fixed Length Array ------------------------------------------------------------------------------------- */
        /* -------------------------------------------------------------------------------------------------------- */

        System.out.println("--------- *** Fixed Array *** ---------");

        int[] numbers1 = new int[5]; //array size - 5

//        int[] numbers = new int[]{10, 20, 30, 40, 50}; //(arrays initializes syntax) array size eka ain karnna puluwan values parse karanwanm, mehem tyeddi split karnna bha.

        //      -------------------------------------------------
        //        int[] numbers = {10, 20, 30, 40, 50}; // mehemath puluwan (Array initializes syntax)
        //      -----------------------------------------------
        //        int[] numbers; //
        //        numbers = {10, 20, 30, 40, 50} // me vidihata split karanna bha

        numbers1[0] = 10;
        numbers1[1] = 20;
        numbers1[2] = 40;
        numbers1[3] = 30;
        numbers1[4] = 29;

        System.out.println("for loop output");
        for (int i = 0; i < numbers1.length; i++) {  //fixed array waladi length() use karanne
            System.out.println(numbers1[i]);
        }

        System.out.println("---------------------");

        System.out.println("Sorted array");
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));


        System.out.println("---------------------");
        System.out.println("for each loop (enhanced for loop) output");
        for (int i: numbers1){ // 16 line eke tiyen for loop eke boiler plate code eka adu krla hdapu for loop eka (Enhanced for loop)
            System.out.println(i);
        }

        numbers1[4] = 99;
        System.out.println(numbers1); // print memeory location of fixed array
        System.out.println(Arrays.toString(numbers1));
        // [10, 20, 30, 40, 99]


        System.out.println();
        System.out.println("--------- *** Dynamic Array (Array List) *** ---------");

        /* ------------------------------------------------------------------------------------------- */
        /* Dynamic Array ----------------------------------------------------------------------------- */
        /* ------------------------------------------------------------------------------------------- */

//      ArrayList<Integer> numbers2 = new ArrayList<Integer>(); //Java 7 walata klin me widihta damme. 7 wlin passe nha
        ArrayList<Integer> numbers2 = new ArrayList<>();    // <> - Diamond syntax
        numbers2.add(11); // 0
        numbers2.add(22); // 1
        numbers2.add(33); // 2
        numbers2.add(44); // 3
        numbers2.add(55); // 4      (add tibbma awaseneta add wenne(tail ekata))


        System.out.println("for loop output");
        for (int i = 0; i < numbers2.size(); i++) {  //dynamic wla size() use karnne
            System.out.println(numbers2.get(i));
        }

        System.out.println("---------------");

        System.out.println("for each loop (enhanced for loop) output");
        for (Integer i: numbers2){ // 37 line eke tiyena for loop eke boiler plate code eka adu krla hdapu for loop eka
            System.out.println(i);
        }

        System.out.println(numbers2);
        // [11, 22, 33, 44, 55]

        numbers2.set(4, 99);
        System.out.println(numbers2);
        // [11, 22, 33, 44, 99]

        numbers2.add(2,48);
        System.out.println(numbers2);
        //[11, 22, 48, 33, 44, 99]

        numbers2.remove(5); // index eken remove karana vidiha
        System.out.println(numbers2);
        //[11, 22, 48, 33, 44]

        numbers2.remove(Integer.valueOf(33)); // value eken remove karana vidiha
        System.out.println(numbers2);
        // [11, 22, 48, 44]

        // OR
        numbers2.remove(new Integer(48)); // value eken remove karana vidiha
        System.out.println("---------------");
        System.out.println(numbers2);
        // [11, 22, 44]

        System.out.println("---------------");

        // Line number 110 to 125 are same

        System.out.println("Print line by line using for loop");
        for (int i = 0; i < numbers2.size(); i++) {
            System.out.println(numbers2.get(i));
        }
        System.out.println("---------------");
        //OR

        System.out.println("Print line by line using for enhanced loop");
        for (Integer integer: numbers2) {
            System.out.println(integer);
        }
        System.out.println("---------------");
        // OR

        System.out.println("Print line by line using for enhanced loop (introduced in java 8)");
        numbers2.forEach(System.out::println);  // line by line print karaganna use karanna puluwan (introduced on java 8)
                                                // :: - Scope Resolution operator

        System.out.println("---------------");

        // [11, 22, 44]
        System.out.println(numbers2.contains(44)); //true
        System.out.println(numbers2.contains(100)); //false

        System.out.println("---------------");
        numbers2.clear(); // remove array
        System.out.println(numbers2);
    }

}
