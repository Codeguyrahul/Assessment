package IO1;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Invalid division");
        }

        try {
            String str = "abc";
            int num = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            System.out.println("Format mismatch");
        }

        try {
            String str = "abc";
            char ch = str.charAt(10);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }

        try {
            int[] arr = {1, 2, 3};
            int x = arr[5];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid");
        }

        try {
            throw new MyException("Custom message");
        } catch (MyException e) {
            System.out.println("My Exception[" + e.getMessage() + "]");
        }

        catch (Exception e) {
            System.out.println("Exception encountered");
        } finally {
            System.out.println("Exception Handling Completed");
        }
    }
}

class MyException extends Exception {
    private String pallabi;

    public MyException(String pallabi) {
        this.pallabi = pallabi;
    }

    public String getPallabi() {
        return pallabi;
    }
}
