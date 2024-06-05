package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String string = "Напишите функцию, которая принимает на вход список "
                + "Строк и возвращает новый список, содержащий только те строки, "
                + "Которые имеют длину больше заданного значения.";
        List<String> strings = List.of(string.split(" "));

        System.out.print("Введите длинну строки ");
        int lengthWord  = in.nextInt();

        System.out.println("\nСтрока до преобразования: "+ "\n");
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = filterLengthOfStrings(strings, lengthWord);

        System.out.println("\nСтрока после сравнения: "+ "\n");
        for (String f : stringsAfter){
            System.out.println(f);
        }

    }

    public static List<String> filterLengthOfStrings(List<String> list, int lengthWord){
        return list.stream()
                .filter(s -> s.length() > lengthWord)
                .collect(Collectors.toList());
    }
}
