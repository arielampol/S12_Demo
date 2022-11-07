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
        // assignments of phone2 and phone3 are called upcasting

        // Here's some downcasting
        // Java doesn't check this at compile time, so watch out!
        // IPhone downcastedIPhone2 = (IPhone) phone2; // results in runtime exception!
        // to protect against the runtime exception above
        IPhone downcastedIPhone;
        if(phone2 instanceof IPhone)
            downcastedIPhone = (IPhone) phone2;
        IPhone downcastedIPhone3 = (IPhone) phone3;

        ((SmartPhone) phone2).openApp("Maps");
        // casting was necessary becuase phone2, even if referencing a SmartPhone, is declared as a Phone

        // Polymorphism!
        SmartPhone smartPhone1 = new AndroidPhone();
        SmartPhone smartPhone2 = new IPhone();

        // Testing whether subclasses are still instanceof superclass
        if( smartPhone1 instanceof Phone )
            System.out.println("smartPhone1 instanceof Phone true!");
        else
            System.out.println("smartPhone1 instanceof Phone false!");
        // Testing whether upcasted subclass objects are still instanceof the true subclass
        if( phone2 instanceof SmartPhone )
            System.out.println("phone2 instanceof SmartPhone true!");
        else
            System.out.println("phone2 instanceof SmartPhone false!");
        // Not all instances of the superclass is an instance of the subclass
        if( phone1 instanceof SmartPhone )
            System.out.println("phone1 instanceof SmartPhone true!");
        else
            System.out.println("phone1 instanceof SmartPhone false!");

        // List is also a generic interface
        // And we said it accepts all SmartPhones
        List<SmartPhone> listOfSmartPhones = new ArrayList<>();
        listOfSmartPhones.add(smartPhone1); //Valid!
        listOfSmartPhones.add(smartPhone2); //Valid!
        // listOfSmartPhones.add(phone2); // Invalid! Because we *declared* phone2 as a Phone
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

        System.out.println("There are " + countSmartPhonesInList(listOfSmartPhones) + "smartPhones in listOfSmartPhones");
    }

    public static int countSmartPhonesInList(List<SmartPhone> myList) {
        int ret = 0;

        for(SmartPhone phone : myList) {
            if(phone instanceof SmartPhone)
               ret++;
        }

        return ret;
    }
}
