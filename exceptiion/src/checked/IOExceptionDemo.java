package checked;

/*
    @author DanujaV
    @created 9/12/23 - 1:17 PM   
*/

import java.io.FileReader;
import java.io.IOException;

public class IOExceptionDemo {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("samplle.txt");
        } catch (IOException e) {
            System.out.println("sorry! this file not exists");
        }

    }
}
