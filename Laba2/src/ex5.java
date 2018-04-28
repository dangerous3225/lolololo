/*
Сравнить имена Ввести с клавиатуры два имени,
и если имена одинаковые, вывести сообщение 
«Имена идентичны». Если имена разные, но их
длины равны – вывести сообщение – «Длины имен равны».
 */
import java.util.Scanner;
public class ex5 {
    public static void main(String[] args) {
        String name1, name2;
        Scanner sc = new Scanner(System.in,"Cp1251");
        System.out.println("Введите первое имя:");
        name1=sc.nextLine();
        System.out.println("Введите второе имя:");
        name2=sc.nextLine();
        Long(name1,name2);
    }
    public static void Long(String name1, String name2) {
        if(name1.equals(name2)){
           System.out.println("Имена идентичны"); 
        } else if (name1.length() == name2.length()){
           System.out.println("Длины имен равны"); 
        }
    }       
}
