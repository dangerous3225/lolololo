/*
Создать двумерный массив из 8 строк 
по 5 столбцов в каждой из случайных
целых чисел из отрезка [10;99].
Вывести массив на экран
 */
public class ex4 {
    public static void main(String[] args) {
        int[][] arr = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (int)(Math.random()*90 + 10);
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
