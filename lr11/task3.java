package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class task3 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список "
                + "Строк и возвращает новый список, содержащий только те строки, "
                + "Которые начинаются с большой буквы.";

        List<String> strings = List.of(string.split(" "));

        System.out.println("Строка до преобразования: "+ "\n");
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = filterCapitalizedStrings(strings);

        System.out.println("\nСтрока после преобразования: "+ "\n");
        for (String f : stringsAfter){
            System.out.println(f);
        }

    }

    public static List<String> filterCapitalizedStrings(List<String> list){
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }

}
