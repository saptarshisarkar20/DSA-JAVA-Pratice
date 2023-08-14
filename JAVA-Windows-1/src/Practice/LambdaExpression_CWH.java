package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * In Java, Lambda expressions basically express instances of functional interfaces (An interface with a single abstract method is called a functional interface)
 */
interface DemoLambda1 {
    void method1();
}

interface DemoLambda2 {
    void method1(int a);
}

interface DemoLambda3 {
    void method1(int a, int b, int c);
}

interface Addable {
    int add(int a, int b);
}

@FunctionalInterface
interface Sayable {
    String say(String message);
}

class DemoProduct1 {
    int id;
    String name;
    float price;

    public DemoProduct1(int id, String name, float price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

public class LambdaExpression_CWH {
    public static void main(String[] args) {
        DemoLambda1 obj1 = () -> System.out.println("1. This is a Lambda Expression.");
        obj1.method1();
        //Lambda Expression: Multiple Parameters
        DemoLambda2 obj2 = (a) -> System.out.println("2. This is a Lambda Expression -> " + a);
        obj2.method1(23);
        DemoLambda3 obj3 = (a, b, c) -> System.out.println("3. This is a Lambda Expression -> " + a + b * c);
        obj3.method1(3, 2, 1);
        // Lambda Expression: Without Return Keyword
        Addable ad1 = (a, b) -> (a + b);
        System.out.println(ad1.add(10, 20));

        // Lambda expression with return keyword.
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
//Lambda Expression: Foreach Loop
        List<String> list = new ArrayList<>();
        list.add("Armpit");
        list.add("Aman");
        list.add("Ankit");
        list.add("Ajay");

        list.forEach(
                (n) -> System.out.println(n)
        );
//Lambda Expression: Multiple Statements
        Sayable person = (message) -> {
            String str1 = "I would like to say, ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("time is precious."));
        //Lambda Expression: Comparator
        List<DemoProduct1> listProduct = new ArrayList<DemoProduct1>();
        listProduct.add(new DemoProduct1(1, "Samsung A5", 17000f));
        listProduct.add(new DemoProduct1(3, "Iphone 6S", 65000f));
        listProduct.add(new DemoProduct1(2, "Sony Xperia", 25000f));
        listProduct.add(new DemoProduct1(4, "Nokia Lumia", 15000f));
        listProduct.add(new DemoProduct1(5, "Redmi4 ", 26000f));
        listProduct.add(new DemoProduct1(6, "Lenevo Vibe", 19000f));

        // using lambda to filter data
        Stream<DemoProduct1> filtered_data = listProduct.stream().filter(p -> p.price > 20000);

        // using lambda to iterate through collection
        filtered_data.forEach(
                product -> System.out.println(product.name + ": " + product.price)
        );
    }

}
