package lr10.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;

public class JsonParser {
    static Object obj;
    static JSONObject jsonObject;

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        try{
            JSONParser parser = new JSONParser();
            obj = parser.parse(new FileReader("G:\\Labs\\labs\\src\\lr10\\JSON\\JSON-example.json"));
            jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("Employers");

            for (Object o : jsonArray){
                JSONObject employer = (JSONObject) o;
                System.out.println("\nТекущий элемент: Employer ");
                System.out.println("Фамилия: " + employer.get("surname"));
                System.out.println("Должность: " + employer.get("post"));
                System.out.println("Зарплата: " + employer.get("salary"));

            }

            //Добавление сотрудника
            System.out.print("\nВведите новую фамилию: ");
            String surNameInput = in.nextLine();
            System.out.print("Введите новую должность: ");
            String postInput = in.nextLine();
            System.out.print("Введите новую зарплату: ");

            String salaryInput = in.nextLine();
            JSONArray jsonArray1 = (JSONArray) jsonObject.get("Employers");
            JSONObject newBook = new JSONObject();
            newBook.put("surname", surNameInput);
            newBook.put("post", postInput);
            newBook.put("salary", salaryInput);
            jsonArray1.add(newBook);

            try (FileWriter file = new FileWriter("G:\\Labs\\labs\\src\\lr10\\JSON\\JSON-example.json")){
                file.write(jsonArray1.toJSONString());
                System.out.println("Файл успешно создан");

            //Удаление из файла
                System.out.println("Введите фамилию, по которой необходимо удалить: ");
                String surName = in.nextLine();
                removeSurName(surName);
                showJson();
            }catch (Exception e){
                e.printStackTrace();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void removeSurName (String surNameScanner){
        JSONArray jsonArray = (JSONArray) jsonObject.get("Employers");
        Iterator iterator = jsonArray.iterator();
        while (iterator.hasNext()) {
            JSONObject employers = (JSONObject) iterator.next();
            if (surNameScanner.equals(employers.get("surname"))) {
                iterator.remove();
            }
        }
    }

    public static void showJson(){
        System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next());
        JSONArray jsonArray = (JSONArray) jsonObject.get("Employers");

        for (Object o : jsonArray){
            JSONObject employer = (JSONObject) o;
            System.out.println("\nТекущий элемент: Employer ");
            System.out.println("Фамилия: " + employer.get("surname"));
            System.out.println("Должность: " + employer.get("post"));
            System.out.println("Зарплата: " + employer.get("salary"));

        }
    }



}
