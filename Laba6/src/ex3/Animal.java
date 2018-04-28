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
public class Animal extends Fish {
    
     
     public Animal () {
     name="Акула";
     }
     
     public void get(){
        System.out.println("Рыба: "+name);
     }
     
     public static void main(String[] args){ 
    Animal name = new Animal();
    name.get();
    }
}
