import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class BehaviourParametrisation   {



    public static void printFruits(List<Fruit> fruits, Predicate<Fruit>   predicate)  {
        fruits.stream()
               .filter(predicate)
               .forEach(System.out::println);
    }

     public static void main(String arg[])   {
        Fruit  apple =  new Fruit(10,"Red", "Apple");
        Fruit   orange  = new Fruit(12, "Orange", "Orange");
        Fruit   mango  = new Fruit(6, "Yellow", "Mango");
        List<Fruit> fruits =  Arrays.asList(apple,orange,mango);
       // printFruits(fruits,(fruit ) -> fruit.color().equals("Yellow"));
        printFruits(fruits,(fruit ) -> fruit.quantity() > 8);
     }

}



record Fruit(int quantity, String color , String name) {}