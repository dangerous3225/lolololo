/*
Проверка на ввод чисел.
 */
import java.util.Scanner;
public class checker {
    int a;
        public int Scan(String i){
           System.out.println("Введите "+ i + " число");
           Scanner sc = new Scanner(System.in);
           if(sc.hasNextInt()) a = sc.nextInt(); else {
               System.out.println("Вы ввели не целое число, повторите еще");
               Scan(i);
           }       
           return a;
        }
}
