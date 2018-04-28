/*
Создайте массив из всех нечётных 
чисел от 1 до 99, выведите его на экран
в строку, а затем этот же массив выведите 
на экран тоже в строку, но в обратном
порядке (99 97 95 93 … 7 5 3 1).
 */
public class ex2 {
    public static void main(String[] args) {
        int arr[]=new int[51];
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i%2 == 1){
                arr[count] = i;
                System.out.print(arr[count] + " ");
                count++;
            }
        }
        for (int i = 100; i > 0; i--) {
            if (i%2 == 1){
                arr[count] = i;
                System.out.print(arr[count] + " ");
                count--;
            }
        }
    }
}
