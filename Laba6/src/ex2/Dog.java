/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.util.Scanner;



/**
 *
 * @author .Dangerous
 */
public class Dog extends Pet {
    static Scanner sc = new Scanner(System.in, "Cp1251");
    public Dog(String name, String mas, String age, String floor) {
        super(name, mas, age, floor);
    }
    public static void main(String[] args) {
        String a = sc.nextLine();
        String b = sc.nextLine();
        String c = sc.nextLine();
        String d = sc.nextLine();
        Dog dog = new Dog(a, b, c, d );
        System.out.print(dog.Name() + " " + dog.Age() + " " + dog.Weight() + " " + dog.Sex() + " ");
    }
}
