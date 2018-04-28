/*
Создайте массив из всех чётных чисел от 2 до 20 
и выведите элементы массива на экран сначала в 
строку, отделяя один элемент от другого пробелом, 
а затем в столбик (отделяя один элемент от другого 
началом новой строки). 
 */
public class ex1 {
    public static void main(String[] args) {
        int arr[]=new int[10];
        for(int i = 0,n = 2; i<10; n += 2,i++) arr[i] = n;
	for(int i=0; i<10; i++) System.out.print(arr[i]+" ");
            System.out.println();
	for(int i=0; i<10; i++) System.out.println(arr[i]);  
    }
}