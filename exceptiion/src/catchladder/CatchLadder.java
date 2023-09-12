package catchladder;

/*
    @author DanujaV
    @created 9/12/23 - 2:09 PM   
*/

import java.io.File;
import java.io.IOException;

public class CatchLadder {
    public static void fileCreateAndLoadClass() throws IOException, ClassNotFoundException {
        File file = new File("abc.txt");
        file.createNewFile();

        Class.forName("Student.class");
    }

    public static void main(String[] args) {
        /*try {
            fileCreateAndLoadClass();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }*/

        /*try {
            fileCreateAndLoadClass();
        } catch (IOException | ClassNotFoundException e) {  //collapse
            System.out.println(e.getMessage());
        }*/

        try {
            fileCreateAndLoadClass();
        } catch (Exception e) {

        }

    }
}
