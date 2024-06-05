package lr10.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Scanner;

public class searchEmployeeJSON {
    static Object obj;
    static JSONObject jsonObject;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try{
            JSONParser parser = new JSONParser();
            obj = parser.parse(new FileReader("G:\\Labs\\labs\\src\\lr10\\JSON\\JSON-example.json"));
            jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент: " + jsonObject.keySet().iterator().next() + "\n");
            JSONArray jsonArray = (JSONArray) jsonObject.get("Employers");

            System.out.print("Введите фамилию по которой произвести поиск: ");
            String surName = in.nextLine();
            for (Object o : jsonArray) {
                JSONObject employee = (JSONObject) o;
                if (surName.equals(employee.get("surname"))) {
                    System.out.println("Текущий элемент: Employers"+ "\n");
                    System.out.print("Фамилия: " + employee.get("surname")+ "\n");
                    System.out.print("Должность: " + employee.get("post")+ "\n");
                    System.out.print("Зарплата: " + employee.get("salary")+ "\n");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
