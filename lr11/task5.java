package lr11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String string = "Напишите функцию, которая принимает на вход список "
                + "Строк и возвращает новый список, содержащий только те строки, "
                + "Которые содержат заданную подстроку.";
        List<String> strings = List.of(string.split(" "));

        System.out.print("Введите строку, с которой необходимо сравнивать: ");
        String word  = in.nextLine();

        System.out.println("\nСтрока до преобразования: "+ "\n");
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = filterCapitalizedStrings(strings, word);

        System.out.println("\nСтрока после сравнения: "+ "\n");
        for (String f : stringsAfter){
            System.out.println(f);
        }

    }

    public static List<String> filterCapitalizedStrings(List<String> list, String word){
        return list.stream()
                .filter(s -> s.equals(word))
                .collect(Collectors.toList());
    }
}
