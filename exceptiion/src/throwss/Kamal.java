package throwss;

/*
    @author DanujaV
    @created 9/12/23 - 1:51 PM   
*/

import java.io.IOException;

public class Kamal {
    public static void main(String[] args) {
        try {
            ThrowsDemo.fileCreate();    //create a new abc.txt
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
