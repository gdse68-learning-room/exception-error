/*
    @author DanujaV
    @created 9/12/23 - 10:08 AM   
*/

public class StackOverFlowErrorDemo {
    private static void methodB() {
        System.out.println("methodB()");
//        try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
        methodA();
    }

    private static void methodA() {
        System.out.println("methodA()");
//        try {Thread.sleep(10);} catch (InterruptedException e) {throw new RuntimeException(e);}
        methodB();
    }

    public static void main(String[] args) {
        System.out.println("main()");
        methodA();
    }
}
