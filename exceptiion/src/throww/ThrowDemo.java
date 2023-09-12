package throww;

/*
    @author DanujaV
    @created 9/12/23 - 2:19 PM   
*/

import java.util.Scanner;

public class ThrowDemo {
    public static void isEligibleForTheVote(int age) {
        if(age >= 18) {
            System.out.println("No worry. You can use the vote!");
        } else {
            throw new IllegalArgumentException("Age is under 18");
        }
    }
    public static void main(String[] args) {
        System.out.print("Input your age: ");
        int age = new Scanner(System.in).nextInt();

        try {
            isEligibleForTheVote(age);
        } catch (IllegalArgumentException e) {
            System.out.println("sorry!");
        }
    }
}
