// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;
public class zd1 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Веедите число: ");
            int num = in.nextInt();
            int multi = 1;   
            System.out.println("Сумма чисел " + num*(num+1)/2);
            for (int i = 2; i <= num; i++) {
                multi = multi * i;
            }
            System.out.println("Произведение чисел " + multi);
        }         
    }   
}