package c2019;

import java.util.Scanner;

public class equalArrays {

    public static void main(String[] args) {
        Scanner fillArrays = new Scanner(System.in);
        System.out.println("Enter how many numbers you want to add to array list1");
        int n1 = fillArrays.nextInt();
        System.out.println("Enter how many numbers you want to add to array list2");
        int n2 = fillArrays.nextInt();

        int[] list1 = new int[n1];
        int[] list2 = new int[n2];
        System.out.println("fill array list1");
        for (int x = 0; x < n1; x++) {
            list1[x] = fillArrays.nextInt();
        }
        System.out.println("fill array list2");
        for (int y = 0; y < n2; y++) {
            list2[y] = fillArrays.nextInt();
        }
        System.out.println(equals(list1, list2));
    }

    public static boolean equals(int a[], int b[]) {
        if (a.length != b.length) {
            return false;
        } else {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return false;
                }
            }
        }
        return true;
    }
}
