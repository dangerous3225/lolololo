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
public class ex6 {
    public static void main(String[] args) throws Exception
    {
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", 3);
        map.put("4", 4);
        map.put("5", 5);
        map.put("6", 6);
        map.put("7", "7");
        map.put("8", "8");
        map.put("9", 9);
        map.entrySet().forEach((pair) -> {
            String key=pair.getKey();
            Object value=pair.getValue();
            System.out.println(key + "-" + value);
        });    
    }    
}
