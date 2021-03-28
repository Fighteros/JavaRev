package c2019;

import java.io.IOException;

class AA{
    public static void Fun() throws Exception {
        try {
            System.out.println("statement in Fun");
            throw new IllegalArgumentException();
        }catch (Exception e){
            System.out.println("Exception in Fun");
            throw e;
        }
        finally {
            System.out.println("Exception in Finally");
        }
    }

    public static void main(String[] args) {
        try{
            Fun();
            System.out.println("Exception in main");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}