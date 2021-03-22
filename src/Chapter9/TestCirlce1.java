package Chapter9;

public class TestCirlce1 {
    // ceate a cricle with radius 5.0
    public static void main(String[] args) {
        // create a circle with radius 5
        Circle1 myCircle = new Circle1(5.0);

        System.out.println(" The area of the Circle of radius " + myCircle.radius + " is " + myCircle.getArea());

        // create a circle with radius 1

        Circle1 yourCircle = new Circle1();
        System.out.println(" The area of the Circle of radius " + yourCircle.radius + " is " + yourCircle.getArea());

        // mdoifiy Cirlce radius 1 to 100

        yourCircle.radius = 100;

        System.out.println(" The area of the Circle of radius " + yourCircle.radius + " is " + yourCircle.getArea());

    }
}
