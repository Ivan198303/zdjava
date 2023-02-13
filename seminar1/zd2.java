// Вывести все простые числа от 1 до 1000
public class zd2 {

    public static void main(String[] args) {
        int num = 1000;
        Next:
        for (int i = 2; i <= num; i++) {
            for (int j = 2; j < i; j++){
                if (i % j == 0) continue Next; 
            }       
        System.out.print(" " + i);        
        } 
    }
}
