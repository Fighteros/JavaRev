package Chapter12;

public class NestedTrys {
    public static void main(String[] args) {
        int n[] = {4, 8, 16, 16, 32, 64, 128, 256, 512};
        int d[] = {2, 0, 4, 4, 0, 8};

//        try{
            for(int i = 0; i < n.length;i++){
                try {
                    System.out.println(n[i]+"/"+ d[i] + "is :"+ n[i]/d[i]);
                }catch (ArithmeticException e){
                    System.out.println("can't divide by Zero");
                }
            }
        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("mo Matching element found");
//            System.out.println("Fetal error -- program terminated");
//        }
//    }
}
