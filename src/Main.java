import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        generateFirstException();
        System.out.println("===============================================");

        generateOwnException();
        System.out.println("===============================================");

        generateNullPointerException();
        System.out.println("===============================================");

        StackException exception = new StackException();
        try {
            exception.f();
        } catch (IOException e) {
            System.out.println(e);
        }
        System.out.println("===============================================");

        MyTestExceptions myTestExceptions = new MyTestExceptions();
        try {
            myTestExceptions.throwsTreeExceptions(3);
        } catch (Exception e) {
            if (e instanceof FirstException) {
                System.out.println("First Exception");
            } else if (e instanceof SecondException) {
                System.out.println("Second Exception");
            } else {
                System.out.println("Third Exception");
            }
        }
    }

    private static void generateFirstException() {
        try {
            throw new Exception("My first exception");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I am here");
        }
    }

    private static void generateOwnException() {
        try {
            throw new OwnException("OwnException");
        } catch (OwnException e) {
            System.out.println(e.print());
        }
    }

    private static void generateNullPointerException() {
        String s = null;
        try {
            s.charAt(0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
