package Chapter9;

public class ThisWrd {
    private int i = 5;
    private static double k = 6;

    public void setI(int i){
        this.i=i;
    }
    public static void setK(double k){
        ThisWrd.k = k;
    }

    public static void main(String[] args) {
        ThisWrd f1 = new ThisWrd();
        ThisWrd f2 = new ThisWrd();

        f1.setI(9);
        f2.setI(0);

        ThisWrd.setK(110.0);
    }
}
