package unchecked;

/*
    @author DanujaV
    @created 9/12/23 - 11:36 AM   
*/

import java.util.Scanner;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        int x = 10;
        System.out.print("Input value: ");
        int y = new Scanner(System.in).nextInt();

        try {
            int res = x / y;
            System.out.println(res);    //?
        } catch (ArithmeticException e) {
            System.out.println("OOPS!");
        }
        System.out.println("end main");


    }
}
