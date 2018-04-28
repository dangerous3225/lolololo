/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacecion;

/**
 *
 * @author .Dangerous
 */
public class Sedan implements PassangersAuto{
    public void transportPassanger() {
        System.out.println("Везу пассажиров");
        }
    public static void main(String[] args){ 
       Sedan ob= new Sedan();
       ob.transportPassanger();
    }   
}
