/*
Создать двумерный массив из 7 строк по 4 столбца
в каждой из случайных целых чисел из отрезка [-5;5].
Вывести массив на экран. Определить и вывести на экран 
индекс строки с наибольшим по модулю произведением
элементов. Если таких строк несколько, то вывести
индекс первой встретившейся из них.
 */
public class ex5 {
    public static void main(String[] args) {
        int[][] arr = new int[7][4];
        int count = 1, max = 0, index = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 4; j++) {
                arr[i][j] = (int)(Math.random()*11 - 5);
                System.out.print(arr[i][j] + " ");
                count *= Math.abs(arr[i][j]);
            }
            if (count > max) {max = count; index = i+1;}
            System.out.println();
            count = 1;
        }
        System.out.println();
        System.out.println(max + " " + index);
    }
}

