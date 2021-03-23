package Chapter12;

public class finallyle {

    public static void main(String[] args) {

        try {
            int a = 9;
            int b = 0;

            int c = a / b;
            System.out.println("after exception");
            System.out.println("after exception");
            System.out.println("after exception");
            System.out.println("after exception");
        }
        catch (NullPointerException e) {
            System.out.println("this is catch block");
        }finally {
            System.out.println("hey");
            System.out.println("hey");
            System.out.println("hey");
            System.out.println("hey");
            System.out.println("hey");

        }
    }
}
