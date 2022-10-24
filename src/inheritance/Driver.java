package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Polymorphism!
        // For any of these Phones, you can only call Phone-related methods
        Phone phone1 = new Phone();
        Phone phone2 = new SmartPhone();
        Phone phone3 = new IPhone();

        // Polymorphism!
        SmartPhone smartPhone1 = new AndroidPhone();
        SmartPhone smartPhone2 = new IPhone();

        // List is also a generic interface
        // And we said it accepts all SmartPhones
        List<SmartPhone> listOfSmartPhones = new ArrayList<>();
        listOfSmartPhones.add(smartPhone1); //Valid!
        listOfSmartPhones.add(smartPhone2); //Valid!
        listOfSmartPhones.add(phone2); // Invalid! Because we *declared* phone2 as a Phone
        // This shows trade-offs of declaring a more "Generic" class type (which is flexible)
        // vs. declaring it as the very specific type (which allows it to meet stricter criteria
        // like the type allowed in a List)

        Object obj1 = "Hello";
        Object obj2 = Integer.parseInt("10");
        Object obj3 = new Phone();

        // LinkedList is a List. ArrayList is a list
        // you can assign both to a List variable
        List<String> myList = new LinkedList<>();
        myList = new ArrayList<>();


    }
}
