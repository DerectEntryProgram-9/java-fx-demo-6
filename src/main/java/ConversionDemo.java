public class ConversionDemo {
    public static void main(String[] args) {
        short a = 10;   // RHS constance expression ekak tiyena nisa meka ok
        byte b = 20;    // RHS constance expression ekak tiyena nisa meka ok.
                        // value eka change wenne nathi nisa compiler ekata ida denwa
                        /* Assignment context waladi withari mehema karanna puluwan wenne */

        byte c = 20 + 10;

        printNumber((byte) 20); // by casting to byte
//        printNumber(20); // this line is not allowed. We can use by casting like in above line.

    }

    public static void printNumber(byte b){
        System.out.println(b);
    }

}
