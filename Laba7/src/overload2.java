
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author .Dangerous
 */
public class overload2 {
        public void print(int n){    
         System.out.println(n);
    }   
    public void print(Integer i){
         System.out.println(i);
    } 
     public static void main(String[] args) {
         overload2 ob = new overload2();
         int n= 2;
         Integer i = new Integer(2);
         ob.print(n);
         ob.print(i);
     }
}
