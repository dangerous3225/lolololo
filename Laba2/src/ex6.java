/*
Координатные четверти Ввести с клавиатуры два 
целых числа, которые будут координатами точки, 
не лежащей на координатных осях OX и OY. Вывести 
на экран номер координатной четверти, в которой 
находится данная точка.
 */
public class ex6 {
    public static void main(String[] args) {
        checker c = new checker();
        int x = c.Scan("X");
        int y = c.Scan("Y");
        if (x >= 0){
            if(y >= 0){
                System.out.print("Первая четверть");
            } else System.err.println("Четвертая четверть");
        }else if(y >= 0) System.out.print("Вторая четверть"); 
        else System.out.print("Третья четверть");
    }
}
