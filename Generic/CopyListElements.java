package Generic;

import java.util.*;

public class CopyListElements {

    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number num : src) {
            dest.add(num);
        }
    }

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(10, 20, 30);

        List<Object> objList = new ArrayList<>();

        copyList(objList, intList);

        System.out.println("Source List: " + intList);
        System.out.println("Destination List after copying: " + objList);
    }
}
