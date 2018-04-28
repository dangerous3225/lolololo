/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
/**
 *
 * @author .Dangerous
 */
public class ex3 {
    public static void main(String[] args) {
        
        Cat[] cats = new Cat[10];
        String[] names = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0"};
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        for (int i=0; i<10; i++) {
            cats[i] = new Cat(names[i]);
            map.put(cats[i].name, cats[i]);
        }
        Iterator<Map.Entry<String, Cat>> itr = map.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Cat> pair = itr.next();
            System.out.println(pair.getKey() + "-" + pair.getValue());        
        }
    }      
}
