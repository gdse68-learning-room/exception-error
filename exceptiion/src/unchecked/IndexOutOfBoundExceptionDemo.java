package unchecked;

/*
    @author DanujaV
    @created 9/12/23 - 12:02 PM   
*/

import java.util.Random;

public class IndexOutOfBoundExceptionDemo {
    public static void main(String[] args) {
        int[] xr = new int[5];

        for (int i = 0; i < 5; i++) {
            xr[i] = new Random().nextInt(101);
        }

        for (int i = 0; i < 6; i++) {

            try {
                System.out.println(xr[i]);  //xr[5] ?
            } catch (IndexOutOfBoundsException e) {

            }
        }
        System.out.println("end main");
    }
}
