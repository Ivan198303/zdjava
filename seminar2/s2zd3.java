// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.
package zdjava.seminar2;

import java.nio.file.Files;
import java.nio.file.Paths;

public class s2zd3 {
    public static void main(String[] args) throws Exception {
        String text = new String(Files.readAllBytes(Paths.get("arr2.txt"))); 
        System.out.println(text); 
        String[] res = text.replaceAll("[^a-zA-Zа-яА-Я0-9:,]", "")
                .replaceAll("[^a-zA-Zа-яА-Я0-9]", " ")
                .split(" ");
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < res.length; i += 6) {
            result.append("Студент ")
                    .append(res[i + 1])
                    .append(" получил ")
                    .append(res[i + 3])
                    .append(" по предмету ")
                    .append(res[i + 5])
                    .append(".\n");
        }
        System.out.println(result);
    }
}