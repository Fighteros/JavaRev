package Chapter9;

public class Circle {
    // The radius of this circle is
    double radius = 1.0;
    // construct a circle
    Circle(){

    }
    // construct a cirlce object
    Circle(double radius){
        this.radius = radius;
    }
    // return the area
    double getArea(){
        return Math.pow(radius, radius)*Math.PI;
    }

}
