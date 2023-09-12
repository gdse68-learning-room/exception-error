package checked;

/*
    @author DanujaV
    @created 9/12/23 - 1:23 PM   
*/

public class ClassNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            Class.forName("Studennt.class"); //Student load
        } catch (Exception e) {
            System.out.println("class not found!");
        }
    }
}
