package throwss;

/*
    @author DanujaV
    @created 9/12/23 - 1:48 PM   
*/

import java.io.File;
import java.io.IOException;

public class ThrowsDemo {
    public static void fileCreate() throws IOException {   //danuja
        File file = new File("abc.txt");

        file.createNewFile();

    }

    public static void main(String[] args) {

    }
}
