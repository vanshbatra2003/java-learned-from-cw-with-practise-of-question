import java.util.HashMap;
import java.util.Map;

public class hashMap64 {
    public static void main(String[] args) {
        Map<String,Integer>mp=new HashMap<>();
        // adding elements 
        mp.put("Akash", 21);
        mp.put("Yash", 16);
        mp.put("Lav", 17);
        mp.put("Rishika", 19);
        mp.put("Harry", 18);
        // getting value of a key from a hashmap
        System.out.println(mp.get("Yash"));
        System.out.println(mp.get("Rahul"));
        // changing value of a key in the hash
        
    }
}
