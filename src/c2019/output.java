package c2019;

class P {
    static int x = 0;
    P(){
        this(2);
        System.out.println("x in default P = "+x);
    }
    P(int y){
        System.out.println("x in class P = "+x);
        x += y;
    }
}
class E extends P{
    E(){
        x++;
        System.out.println("x in default E=" +x);
    }
}
class F extends E {
    public static void main(String[] args) {
        x++;
        new F();
    }
    F(){
        x++;
        System.out.println("x in default F="+x);
    }
}


