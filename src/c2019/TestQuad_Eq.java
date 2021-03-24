package c2019;

import java.util.Scanner;

public class TestQuad_Eq {
    public static void main(String[] args) {
        double a, b, c;
        Scanner inputData = new Scanner(System.in);
        System.out.println("please Enter a:");
        a = inputData.nextDouble();
        System.out.println("please Enter b:");
        b = inputData.nextDouble();
        System.out.println("please Enter c:");
        c = inputData.nextDouble();
        Quad_Eq qdeq = new Quad_Eq(a, b, c);
        if (qdeq.getDiscriminant() > 0){
            System.out.println(qdeq.getRoot1());
            System.out.println(qdeq.getRoot2());
        }else if (qdeq.getDiscriminant() == 0){
            System.out.println(qdeq.getRoot1());
        }else{
            System.out.println("the equation has no solution ");
        }
    }
}

class Quad_Eq {
    private double a, b, c;

    Quad_Eq() {

    }

    Quad_Eq(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // setters
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    // getters

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    public double getRoot1() {
        return getDiscriminant() < 0 ? 0 : ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

    public double getRoot2() {
        return getDiscriminant() < 0 ? 0 : ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    }

}

