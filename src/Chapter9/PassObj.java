package Chapter9;

public class PassObj {

    public static void main(String[] args) {
        for (int i = 5; i > 0 ;i--){
            printCircle(new Circle3(i));
        }
    }
    // print table of results
    public static void printCircle (Circle3 obj){
        System.out.println("Radius \t\t Area");
        System.out.println(+obj.getRadius()+"\t\t"+ obj.getArea());
    }
}

