package unchecked;

/*
    @author DanujaV
    @created 9/12/23 - 11:53 AM   
*/

import java.util.Scanner;

public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        Scanner input = null;


        System.out.print("Input a value: ");

        try {
            int x = input.nextInt();
            System.out.println(x);
        } catch (NullPointerException e) {
            System.out.println("something happened");
            System.out.println(e.getMessage());
        }
        System.out.println("end main");
    }
}
