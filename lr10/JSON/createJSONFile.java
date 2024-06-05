package lr10.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;

public class createJSONFile {

    public static void main(String[] args) {

        JSONObject org = new JSONObject();
        JSONArray Employee = new JSONArray();

        JSONObject Employer1 = new JSONObject();
        Employer1.put("surname","Petrov");
        Employer1.put("post","Boss");
        Employer1.put("salary",5000);

        JSONObject Employer2 = new JSONObject();
        Employer2.put("surname","Ivanov");
        Employer2.put("post","Deputy Boss");
        Employer2.put("salary",4000);

        Employee.add(Employer1);
        Employee.add(Employer2);

        org.put("Employers", Employee);

        try (FileWriter file = new FileWriter("G:\\Labs\\labs\\src\\lr10\\JSON\\JSON-example.json")){
            file.write(org.toJSONString());
            System.out.println("Файл успешно создан");

        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
