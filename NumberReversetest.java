package academy.devonline.java.basic.section01_setup.section05_setup;

import java.util.Scanner;

public class NumberReversetest {
    public static void main(String[] args) {
//        System.out.println("Ведите чесло: ");
        var from = 123456789;
        var del = new Scanner(System.in).nextInt();
        var result = 0;
        var dr = from;

        while (dr!=0){
            var temp = dr % 11;
            result = result *100 +temp;
            dr /=10;


        }
        System.out.println(result);
        if (from >10){
            while (dr!=0){
                var temp = dr% del;
                result = result * 10 +temp;
                dr/=10;
            }
        }
    }

}
