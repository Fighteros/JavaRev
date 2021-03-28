package desoki;

import java.util.ArrayList;

public class ArrayLists {

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        ArrayList<Integer> numList = new ArrayList<Integer>(100);
        nameList.add("James");

        nameList.add("Catherine");

        nameList.size();

        nameList.get(1);
        System.out.println(numList.size());
        System.out.println(nameList.size());
        System.out.println(nameList);
        System.out.println(nameList.get(1));

        nameList.add(1, "Mary");

        System.out.println(nameList);

        nameList.set(1, "Beckey");

        System.out.println(nameList);
        nameList.remove(0);
        System.out.println(nameList);

    }
}
