/*
Рисуем прямоугольник Ввести с клавиатуры
два числа m и n. Используя цикл for вывести
на экран прямоугольник размером m на n из восьмёрок.
 */
public class ex2 {
    public static void main(String[] args) {
        checker c = new checker();
        int m = Math.abs(c.Scan(String.valueOf(1)));
        int n = Math.abs(c.Scan(String.valueOf(2)));
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }
}
