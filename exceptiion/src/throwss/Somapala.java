package throwss;

/*
    @author DanujaV
    @created 9/12/23 - 1:58 PM   
*/

import java.io.IOException;

public class Somapala {
    public static void main(String[] args) {
        try {
            ThrowsDemo.fileCreate();
        } catch (IOException e) {
            System.out.println("I don't care");
        }
    }
}
