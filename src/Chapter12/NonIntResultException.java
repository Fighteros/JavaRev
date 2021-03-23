package Chapter12;

public class NonIntResultException extends Exception{
    int n;
    int d;
    NonIntResultException(int n, int d){
        this.n = n;
        this.d=d;
    }

    @Override
    public String toString() {
        return "Result of " +
                "n=" + n +
                "/ d=" + d +"is non Integer";
    }

}

class CustomExceptDemo {
    public static void main(String[] args) {
        int n[] = {4, 8, 15, 32, 64, 127, 256, 512};
        int d[] = {2, 0, 4, 4, 0, 8};
        for(int i = 0; i<n.length;i++){
            try{
                if (n[i] % d[i] != 0) throw new NonIntResultException(n[i], d[i]);
                System.out.println(n[i]+"/" +d[i] + "is" +n[i]/d[i]);
            }catch (ArithmeticException e){
                System.out.println("can't divide by zero");
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println("No matching element was found");
            }catch (NonIntResultException e){
                System.out.println(e);
            }
        }

    }
}
