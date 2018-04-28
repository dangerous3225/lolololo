/*
Минимум двух чисел. Ввести с клавиатуры два
числа, и вывести на экран минимальное из 
них (Поиск минимума выполняется в функции).             Объединил 2 варианта

Минимум четырех чисел Написать функцию, которая
вычисляет минимум из четырёх чисел. Функция min(a,b,c,d)
должна использовать (вызывать) функцию min(a,b).
 */
public class ex4 {
    public static void main(String[] args) {
    System.out.println("Минимальное число: " + sort(enter()));
    }
    public static int[] enter(){
        checker c = new checker();
        int[] arr = new int[Math.abs(c.Scan("количество"))];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = c.Scan(String.valueOf(i+1));
        }
        return (arr);
    }   
    public static int sort(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
        }
        return min;
    }
}
