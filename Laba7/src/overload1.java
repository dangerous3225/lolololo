/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author .Dangerous
 */
public class overload1 {
    public void print(int n){
    System.out.println(n);
    }  
    public void print(String s){
    System.out.println(s);
    }
    public static void main(String[] args) {
        overload1 ob = new overload1();
        int n = 1;
        String s = "123";
        ob.print(n);
        ob.print(s);
    } 
}
