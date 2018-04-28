/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.util.Scanner;

/**
 *
 * @author .Dangerous
 */
public class Pegas extends Horse {
    Scanner sc = new Scanner(System.in,"Cp1251");
    public void fly() {
    }

    public Pegas(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Pegas name = new Pegas("Kon'");
        name.fly();
    }     
}
