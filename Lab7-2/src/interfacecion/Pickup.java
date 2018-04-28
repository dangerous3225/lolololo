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
public class Pickup implements CargoAuto, PassangersAuto{
     public void transportPassanger() {
        System.out.println("Везу пассажиров");
        }
     
     @Override
    public void transportCargo() {
        System.out.println("Везу груз");
        }
     
      public static void main(String[] args){ 
        Pickup ob= new Pickup();
       ob.transportPassanger();
       ob.transportCargo();
    }    
}
