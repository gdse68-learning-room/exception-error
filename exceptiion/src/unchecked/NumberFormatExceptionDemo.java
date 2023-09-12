package unchecked;

/*
    @author DanujaV
    @created 9/12/23 - 11:58 AM   
*/

public class NumberFormatExceptionDemo {
    public static void main(String[] args) {
        String n1 = "Kamal";
        String n2 = "Saman";

        try {
            int total = Integer.parseInt(n1) + Integer.parseInt(n2);
            System.out.println("Total: " + total);  //30
        } catch (NumberFormatException e) {
            System.out.println("oops!");
        }
        System.out.println("end main");
    }
}
