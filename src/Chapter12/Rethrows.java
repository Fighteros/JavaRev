
package Chapter12;

class Rethrows {

    public static void genException() {
        int n[] = {4, 8, 16, 16, 32, 64, 128, 256, 512};
        int d[] = {2, 0, 4, 4, 0, 8};

        try {
            for (int i = 0; i < n.length; i++) {
                try {
                    System.out.println(n[i] + "/" + d[i] + "is :" + n[i] / d[i]);
                } catch (ArithmeticException e) {
                    System.out.println("can't divide by Zero");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("no Matching element found");
//            System.out.println("Fetal error -- program terminated");
            throw e;
        }
    }
}

class RethrowDemo {
    public static void main(String[] args) {
        try {
            Rethrows.genException();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("fetal error _+ program terminated");
        }
    }
}


