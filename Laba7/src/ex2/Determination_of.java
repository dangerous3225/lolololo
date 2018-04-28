/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author .Dangerous
 */
public class Determination_of extends det{
    public static void main(String[] args) {
    Determination_of ob = new Determination_of();
    Cat cat = new Cat();
    Dog dog = new Dog();
    Bird bird = new Bird();
    Lamp lamp = new Lamp();
         
    ob.method(cat);
    ob.method(dog);
    ob.method(bird);
    ob.method(lamp);
    }
}

