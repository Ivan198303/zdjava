// Реализовать простой калькулятор Введите число 2 Введите операцию 1 + 2 - 3 * 4 / Введите число 2 2 + 2 = 4
import java.util.Scanner;
public class zd3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Веедите первое число: ");
            float num = in.nextInt();
            System.out.print("Веедите второе число: ");
            float num1 = in.nextInt();
            System.out.println("Введите номер операции: 1= - :" + "2= + :" + " 3= / :" + " 4= *:");
            int num2 = in.nextInt();
            if (num2 >= 1 & num2 <= 4){
                System.out.println(num);
                System.out.println(num1);
                if (num2 == 1) System.out.println("Разность " + num  + "-" + num1 + " = " + (num - num1));
                if (num2 == 2) System.out.println("Сумма " + num  + "+" + num1 + " = " + (num + num1));
                if (num2 == 3) System.out.println("Деление " + num  + "/" + num1 + " = " + (num / num1));
                if (num2 == 4) System.out.println("Умножение " + num  + "*" + num1 + " = " + (num * num1));
            } else {
                System.out.println("Введен неверный номер операции");  
            }
        }
        
    }   
}