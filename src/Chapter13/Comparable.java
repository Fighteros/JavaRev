//package Chapter13;
//
//import java.awt.*;
//
//public class Comparable extends Rectangle implements java.lang.Comparable<ComparableRectangle> {
//    public ComparableRectangle(double width, double height) {
//        super(width, height);
//    }
//
//    @Override
//    public int compareTo(ComparableRectangle o) {
//        if (getArea() > o.getArea()) return 1;
//        else if (getArea() < o.getArea()) return -1;
//        else return 0;
//    }
//    @Override
//    public String toString(){
//        return super.toString()+ "Area" + getArea();
//    }
//}