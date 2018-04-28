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
public class ex5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        for (int i = 1; i <= 10; i++){
            map.put("key"+i,"value"+ i);
        }
        Iterator<Map.Entry<String, String>> itr = map.entrySet().iterator();
        while (itr.hasNext()){
            Map.Entry<String, String> pair = itr.next();
            String value = pair.getValue();            
            System.out.println(value);
        }
    }     
}
