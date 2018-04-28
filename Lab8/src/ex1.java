/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashSet;
import java.util.Iterator;
/**
 *
 * @author .Dangerous
 */
public class ex1 {
    public static void main(String[] args) {
        
     HashSet <String> set = new HashSet<String>();
     set.add("арбуз");
     set.add("банан");
     set.add("вишня");
     set.add("груша");
     set.add("дыня");
     set.add("ежевика");
     set.add("жень-шень");
     set.add("земляника");
     set.add("ирис");
     set.add("картофель");
     
      Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
          String text = iterator.next();
          System.out.println(text);
        }   
    }
}
