// // Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package zdjava.seminar2;


import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

// /**
//  * s2zd2
//  */
public class s2zd2 {
    public static Logger logger = Logger.getLogger(s2zd2.class.getName()); 
        
    public static void main(String[] args) {
        int[] arr = new int[] { 12, 34, 48, 9, 14, 7, 986, 5, 11, 112 };
        sortArray(arr);
      
    } 
        
    public static int[] sortArray(int[] array) {

        int temp = 0;
        
        for (int j = 0; j < array.length - 1; j++) { 
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i + 1] < array[i]) {
                    temp = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = temp;
                    logger.log(Level.INFO,String.format("%d <-> %d, %s", array[i],array[i + 1], Arrays.toString(array)));
                }
            }
        }
        return array;
    }
     
}   

