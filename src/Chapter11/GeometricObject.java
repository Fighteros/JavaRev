package Chapter11;

public class GeometricObject {
    private double radius ;

    public GeometricObject(){

    }
    public GeometricObject(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public  String toString() {
        return "GeometricObject{" +
                "radius=" + radius +
                '}';
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
