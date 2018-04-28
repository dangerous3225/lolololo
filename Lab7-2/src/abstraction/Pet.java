/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author .Dangerous
 */
public abstract class Pet {
    public String name;
    public int age;
    public boolean hungry;
    public abstract void voice();
    
    public static void main(String[] args) {
        PatrolDog pes=new PatrolDog();
        pes.voice();      
    }
    
}
