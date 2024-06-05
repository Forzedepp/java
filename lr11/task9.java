package lr11;

import java.util.List;
import java.util.stream.Collectors;

public class task9 {
    public static void main(String[] args) {

        String string = "Напиши1те функцию, которая прин2имает на вход спи4сок "
                + "Строк и возвращает новый список, содержащий тол1ько те стро2ки, "
                + "Ко5торые содер5жат только буквы (без цифр и символов).";
        List<String> strings = List.of(string.split(" "));



        System.out.println("\nСтрока до преобразования: "+ "\n");
        for (String e : strings){
            System.out.println(e);
        }

        List<String> stringsAfter = filterClearStrings(strings);

        System.out.println("\nСтрока после сравнения: "+ "\n");
        for (String f : stringsAfter){
            System.out.println(f);
        }
    }

    public static List<String> filterClearStrings(List<String> list){
        return list.stream()
                .filter(s -> s.matches("[а-яА-Я]+"))
                .collect(Collectors.toList());
    }
}
