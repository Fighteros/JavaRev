package Chapter9;

public class Circle1 {
    double radius;

    //  create a circle with radius = 1
    Circle1(){
        radius = 1.0;
    }
    // create a circle with specific radius
    Circle1 (double radius){
        this.radius = radius;
    }
    // return cicle area
    double getArea(){
        return Math.pow(radius, radius)*Math.PI;
    }
}
