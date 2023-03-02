// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. Значения null не включаются в запрос.
package zdjava.seminar2;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * s2zd1
 */
public class s2zd1 {
public static void main(String[] args) throws Exception {
    String text = new String(Files.readAllBytes(Paths.get("arr1.txt"))); 
    System.out.println(text); 
    StringBuilder builder = new StringBuilder();
    builder.append("SELECT * FROM students WHERE ");

    String[] line = text.split(",");
    for (String line1 : line) {
        // System.out.println(line1);
        String[] linesText = line1.split(":");
        String lines = linesText[0];
        String Text = linesText[1];
        lines = lines.substring(1, lines.length() - 1);
        System.out.println(lines);
        System.out.println(Text);
        if (Text.equals("\"null\""))
            continue;   
        builder.append(String.join( Text, lines," AND " ));         
    }
    
    System.out.println(builder.substring(0, builder.length() - 5));
}
    
}