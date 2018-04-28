/*
Создать метод, который будет 
сортировать указанный массив по возрастанию
любым известным вам способом.
 */
public class ex3 {  
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println("Первоначальный вид");
        for(int i = 0; i < arr.length; i++){
            arr[i]=(int)(Math.random()*9);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        bubbleSort(arr);    
    }  
    public static int[] bubbleSort(int[]a) {
        System.out.println("После сортировки: ");
        for (int i = a.length-1; i>1; i--)
            for (int j = 0; j < i; j++)
                if (a[j] > a[j+1]) {
                int tmp = a[j];
                a[j] = a[j+1];
                a[j+1] = tmp;
            }
        for(int i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");
        return null;
    }        
}
