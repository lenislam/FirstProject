package map;

import com.sun.security.jgss.GSSUtil;

import java.util.HashMap;
import java.util.Map;


// Purpose
public class InfoMap {

    String name="James"; // String

    public static void main(String[] args) {
        Map<String,String> stateMap=new HashMap<>();
    stateMap.put("USA","DC");
    stateMap.put("Canada","Toronto");
    stateMap.put("Australia","Sydney");
    stateMap.put("Bangladesh","Dhaka");
    stateMap.put("India","Delhi");
    stateMap.put("Pakistan","Lahore");

// Retrieve value from Map
        for (Map.Entry<String,String> entry:stateMap.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

        System.out.println(stateMap.get("Bangladesh"));
        //Wrapper class : Integer which hold all type primitive data
        Map<String,Integer> pizzaTypePrice=new HashMap<>();
        pizzaTypePrice.put("Pizza",20);
        pizzaTypePrice.put("Pizza",30);
        pizzaTypePrice.put("Pizza",10);
        pizzaTypePrice.put("Pizza",40);

        for (Map.Entry<String,Integer> st: pizzaTypePrice.entrySet()) {
            System.out.println(st.getKey()+":"+st.getValue());
        }
    }
}
