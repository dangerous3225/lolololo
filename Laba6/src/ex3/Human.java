/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author .Dangerous
 */
public class Human extends Ape {
    public Human () {
     name="горилла";
     }
      public void get(){
        System.out.println("человек/обезьяна: "+name);
     } 
      public static void main(String[] args){ 
    Human name = new Human();
    name.get();
    }
}
