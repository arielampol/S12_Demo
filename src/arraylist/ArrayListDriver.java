package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDriver {
    private static int staticInt = 10;
    public static final int CONSTANT = 10;

    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        ArrayList<String> arrListDeepCopy = new ArrayList<>(arrList);
        //Not the same as:
        ArrayList<String> arrListNotDeepCopy = arrList;
        arrList.add("Monday");
        arrList.add("Tuesday");
        arrList.add("Wednesday");
        arrList.add("Thursday");
        arrList.add(4, "Friday");

        System.out.println("Did I find \"Friday\" there? " + (arrList.contains("Friday") ? "Yes" : "No"));
        System.out.println("Did I find \"Sunday\" there? " + (arrList.contains("Sunday") ? "Yes" : "No"));

        //Sorting Lists
        System.out.println("Pre-sort:" + arrList);
        Collections.sort(arrList);
        System.out.println("Post-sort:" + arrList);

        System.out.println("The size of arrList before Friday removal is " + arrList.size());
        boolean removed = arrList.remove("Friday");
        System.out.println("Did I remove 'Friday'? " + (removed ? "Yes" : "No"));
        System.out.println("The size of arrList after Friday removal is " + arrList.size());


        System.out.println("The size of arrList before Tuesday removal is " + arrList.size());
        removed = arrList.remove("Tuesday");
        System.out.println("Did I remove 'Tuesday'? " + (removed ? "Yes" : "No"));
        System.out.println("The size of arrList after Tuesday removal is " + arrList.size());

        System.out.println(arrList.toString());

        arrListNotDeepCopy.add(3, "Value");
        System.out.println("arrList " + arrList);
        System.out.println("arrListNotDeepCopy " + arrListNotDeepCopy);

        // You CAN'T do this: arrList[1]. Do this:
        System.out.println(arrList.get(1));
        //But you can do this:
        String[] emptyArr = new String[0];
        String[] fromList1 = arrList.toArray(emptyArr);
        System.out.println( fromList1[1] );
        //Or
        String[] fromList2 = arrList.toArray(new String[arrList.size()]);
        System.out.println( fromList2[1] );
        //ArrayList -> regular array -> array notation access


        //Illegal add
//        arrList.add(Integer.valueOf(10));

        //Halo-halo ArrayList
        ArrayList<Object> mixedArrayList = new ArrayList<>();
        mixedArrayList.add(Integer.valueOf(10));
        mixedArrayList.add("A string");
        mixedArrayList.add(new ArrayList<>());

        //ArrayList of ArrayLists
        ArrayList<ArrayList<String>> twoDArrayList = new ArrayList<>();
    }

    /**
     * Static functions demo
     */
    private static void bar() {
        // Static method as a factory method for String
        String hello = String.format("Hello");
        String empty = "";
        empty.format("Hello");
        // ^^^ This is essentially the same as String.format("Hello");

        // Static method as a factory method for Integer
        Integer numberTen = Integer.valueOf("10");
    }

    public static int getStaticInt() {
        return staticInt;
    }

    private void foo() {
        bar();
    }

}
