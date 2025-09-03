import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
//        We've told HashMap we're storing the Key as a String and the value as a Double
        HashMap<String, Double> map = new HashMap<>();

//        Keys have to be unique, duplicate will overwrite the previous values
        map.put("apple", 0.50);
        map.put("orange", 0.75);
        map.put("banana", 0.25);
        map.put("coconut", 1.0);

        System.out.println(map); // {orange=0.75, banana=0.25, apple=0.5, coconut=1.0}

        map.remove("apple");
        System.out.println(map); // {orange=0.75, banana=0.25, coconut=1.0}

        System.out.println(map.get("orange")); // 0.75

        System.out.println(map.containsKey("banana")); //true
        System.out.println(map.containsKey("pineapple")); //false

        String fruit = "banana";

        if(map.containsKey(fruit)){
            System.out.println(map.get(fruit) + " found");
        }else {
            System.out.println("Key not found");
        }

        System.out.println(map.containsValue(1.0)); //true

        System.out.println(map.size()); //3

        for (String key : map.keySet()){
            System.out.println(key + " : £" + map.get(key));
        }
//        orange : £0.75
//        banana : £0.25
//        coconut : £1.0

    }
}
