package custom;

/*
    @author DanujaV
    @created 9/12/23 - 2:31 PM   
*/

import java.util.Scanner;

public class Vote {
    private static void isEligibleForTheVote(int age) throws AreYouCrazyException {
        if(age >= 18) {
            System.out.println("Eligible!");
        } else {
            throw new AreYouCrazyException("Thama podi wadi!");
        }
    }

    public static void main(String[] args) {
        System.out.print("Input your age: ");
        int age = new Scanner(System.in).nextInt();

        try {
            isEligibleForTheVote(age);
        } catch (AreYouCrazyException e) {
            System.out.println(e.getMessage());
        }

    }
}
