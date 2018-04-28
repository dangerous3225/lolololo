/*
Создать метод, который будет выводить указанный
массив на экран в строку. С помощью созданного 
метода и метода из предыдущей задачи заполнить 
5 массивов из 10 элементов каждый случайными 
числами и вывести все 5 массивов на экран,
каждый на отдельной строке.
 */

import java.util.Scanner;
public class ex2 {
        public static int[][] enter(int[][] arr) {
        for(int i=0;i < arr.length;i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
       
               System.out.println();  
        } 
        return arr;
    }
    public static int method(int a, int b){
        int c, temp;
        if (a>b) {
            temp = b;
            b = a;
            a = temp;
        }
        c = (int)(Math.random()*((b+1)-a)+a);
        return c;
    }
    public static void main(String[] args) {
        int a, b;
            Scanner sc = new Scanner(System.in);
                System.out.print("Введите a: ");
                a = sc.nextInt();
                System.out.print("Введите b: ");
                b = sc.nextInt();   
        System.out.print("Отрезок: [" + a + ";" + b + "]");
        System.out.println();
        int arr[][] = new int[5][10];
            for(int i=0; i<arr.length; i++) {
                for(int j=0; j<arr[i].length; j++){
                    arr[i][j]=(int)(method(a,b)); 
                }
            }
            enter(arr);
    }   
}
