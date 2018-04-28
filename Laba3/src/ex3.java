/*
Создайте массив из 15 случайных целых 
чисел из отрезка [0;9]. Выведите массив 
на экран. Подсчитайте сколько в массиве
чётных элементов и выведете это количество
на экран на отдельной строке.
 */
public class ex3 {
    public static void main(String[] args) {
        int[] arr = new int[14];
        int k = 0;
        for (int i = 0; i < 14; i++) {
            arr[i] =(int)(Math.random()*9);
            System.out.print(arr[i] + " ");
            if(arr[i]%2 == 0) k++;
        }
        System.out.println();
        System.out.println(k);
    }
}
