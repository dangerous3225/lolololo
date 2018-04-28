/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
/**
 *
 * @author .Dangerous
 */
public class ex2 {
    public static void main(String[] args) {
        HashMap <String, String> check = new HashMap<>();
        check.put("арбуз", "ягода");
        check.put("банан", "трава");
        check.put("вишня", "ягода");
        check.put("груша", "фрукт");
        check.put("дыня", "овощ");
        check.put("ежевика", "куст");
        check.put("жень-шень", "корень");
        check.put("земляника", "ягода");
        check.put("ирис", "цветок");
        check.put("картофель", "клубень");
        check.forEach((s, s2) -> System.out.println(s + " - " + s2));

    }
}
