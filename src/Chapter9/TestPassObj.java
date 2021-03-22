package Chapter9;

public class TestPassObj {

    public static void main(String[] args) {
        Circle3[] circleArray;
        circleArray = createCircleArray();
        printCircleArray(circleArray);
    }

    public static Circle3[] createCircleArray() {
        Circle3[] circleArray = new Circle3[5];

        for (int i = 0; i < circleArray.length; i++) {
            circleArray[i] = new Circle3(Math.random() * 100);
        }
        return circleArray;
    }

    public static void printCircleArray(Circle3[] circleArray) {
        // %[flags: (-)left, right, center justfiy][width: field width and minimum num of chars][.precison: تقريب الاعداد]converstion-charchter{s, t , d, f}
        System.out.printf("%-30s%-15s\n", "Radius", "Area");
        // print array
        for (int i = 0; i < circleArray.length; i++) {
            System.out.printf("%-30f%-15f\n", circleArray[i].getRadius(), circleArray[i].getArea());
        }
        System.out.println("------------------------------");
        System.out.printf("%-30s%-15f\n", "the total areas of circles is", sum(circleArray));
    }

    public static double sum(Circle3[] circleArray) {
        double sum = 0;
        for (int i = 0; i < circleArray.length; i++){
            sum += circleArray[i].getArea();
        }
        return sum;
    }
}
