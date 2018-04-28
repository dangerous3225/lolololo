/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author .Dangerous
 */
public class ex1 {
    public static class Cow {
    public void getName() {
    System.out.println("Я - корова");
    }
}

public static class Whale extends Cow{
    @Override
    public void getName() {
    System.out.println("Я не корова, Я – кит.");
    }
}
    public static void main(String[] args) {
        Cow whale= new Whale();
        whale.getName();
    }
}
