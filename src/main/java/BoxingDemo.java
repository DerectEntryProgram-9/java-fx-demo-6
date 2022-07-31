public class BoxingDemo {

            //        char -> Character
            //        boolean -> Boolean
            //        short -> Short
            //        int -> Integer
            //        long -> Long
            //        double -> Double
            //        float -> Float

            /*Boxing*/
            int myInt = 10;
            Integer g = new Integer(20); /* me line dekenma karnnne primitive value ekak wrapper class ekkin wrapup
                                                      krna eka*/
            Integer g2 = Integer.valueOf(20); /* me line dekenma karnnne primitive value ekak wrapper class ekkin wrapup
                                                      krna eka*/

            /*Auto-Boxing*/
            Integer i3 = 10;

            /* Long l = 10; */  // mehema karnna bha. meka vishesha awasthawak
            Long l = new Long(10);
            Long l2 = Long.valueOf(10);

            /* Auto boxing */
            Long l3 = 10L;


            /* Boxing */
            Integer i = new Integer(10);

            /* Auto-boxing */
            Integer a = 10;

            /* Unboxing */
            int b = i.intValue();

            /* Auto-boxing */
            int x = i;

            long y = 20;
            Long k = Long.valueOf(20);   //(int ekak dammoth auto boxing wenne ne long ekkata daddi.
                                            // e kiyanne manually box karanna wenawa)
            Long k1 = new Long(20);   // mehemath puluwan manually box karanna

}
