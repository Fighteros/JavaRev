package Chapter9;

public class OverLoadedCnstrctor {
    private double radius;

    public OverLoadedCnstrctor(double radius){
        this.radius = radius;
    }
    public OverLoadedCnstrctor(){
        this(1.0);
    }
}
