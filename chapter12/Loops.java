package chapter12;

import java.util.*;

public class Loops {

    public static void setExample(){
        Set<String> names = new HashSet(); //Add String to <> to not make what is added an object
        names.add("Bob");
        names.add("Mike");
        names.add("Amy");
        names.add("Sam");
        names.add("Bob"); //Will not duplicate

        System.out.println(names.size());
        System.out.println(names);

        var i = names.iterator(); //Use to loop through set
        while(i.hasNext()){ //Will check if another object is ahead to continue
            System.out.print(i.next() + " ");
        }

        System.out.print("\n");

        for(String n : names){ //Allowed because Set has <String>
            System.out.print(n + " ");
        }

        System.out.print("\n");

        names.forEach(n -> System.out.print(n + " ")); //Advanced loop
        //names.forEach(System.out::println); Identical to the advanced method used above, but simpler
    }

    public static void listExample(){
        List candy = new ArrayList<>();
        candy.add("Snickers");
        candy.add("Hershey");
        candy.add("Butterfinger");
        candy.add("Snickers"); //Allows for duplication
        candy.add("Skittles");

        System.out.println(candy.get(3));
        System.out.println(candy.size());
        System.out.println(candy);
    }

    public static void queueExample(){
        Queue animals = new LinkedList();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Rabbit");
        animals.add("Fish");
        animals.add("Dog");

        System.out.println(animals.size());
        System.out.println(animals);

        animals.remove(); //Will remove first element (Cat)
        System.out.println(animals);

        System.out.println(animals.peek()); //Peek allows for next object in queue to be seen

    }

    public static void mapExample(){
        Map<String, Integer> toppings = new HashMap();
        toppings.put("Pepperoni",1);
        toppings.put("Sausage",2);
        toppings.put("Pineapple",3);
        toppings.put("Olives",4);
        toppings.put("Pepperoni",5);

        System.out.println(toppings.size());
        System.out.println(toppings);

        System.out.println(toppings.get("Pepperoni"));
        System.out.println(toppings.entrySet());

        System.out.println(toppings.remove("Pepperoni"));
        System.out.println(toppings);

        for(var entry : toppings.entrySet()){
            System.out.print(entry.getValue() + " ");
        }

        System.out.print("\n");

        toppings.forEach((k,v) -> System.out.println("Topping: "+k+" Price: "+v));
    }
}
