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
public class Pet {
    Scanner sc = new Scanner(System.in, "Cp1251");
    private String name, weight, age, sex;
    public String Name() {
        return name;
    }
    public String Weight() {
        return weight;
    }
    public String Age() {
        return age;
    }
    public String Sex() {
        return sex;
    }
    public Pet(String name, String weight, String age, String sex) {
       this.name= name;
       this.weight = weight;
       this.age = age;
       this.sex = sex;
    }
}
