package Chapter12;

public class UseThrowableMethods {
    public static void main(String[] args) {
        int nums[] = new int[4];
        try{
            System.out.println("Before Exception is generated");
            nums[7]=10;
            System.out.println("this won't be displayed");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Standard message is: ");
            System.out.println(e);
            System.out.println(e.toString());
            System.out.println("Stack trace: ");
            e.printStackTrace();

        }
    }
}
