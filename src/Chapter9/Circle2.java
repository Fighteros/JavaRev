package Chapter9;

public class Circle2 {
    double radius;
    static int numberOfObjects;
    Circle2(){
        radius = 1.0;
        numberOfObjects++;
    }
    Circle2(double radius){
        this.radius = radius;
        numberOfObjects++;
    }

    static int getNumberOfObjects(){
        return numberOfObjects;
    }

    double getArea() {
        return radius*radius*Math.PI;
    }
}

