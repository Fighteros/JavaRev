package Chapter9;

public class Circle3 {
    private double radius = 1;
    private  static int numberOfObjects = 0;
    public Circle3(){
        numberOfObjects++;
    }
    public Circle3(double radius){
        this.radius = radius;
        numberOfObjects++;
    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius >= 0)? radius:0;
    }
    public double getArea(){
        return Math.PI * Math.pow(radius, radius);
    }

    public static void main(String[] args) {
        new Circle3();
        new Circle3(5.0);
        int t = Circle3.getNumberOfObjects();
        System.out.println(new Circle3(5.0).getArea());

    }
}
