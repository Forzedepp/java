package ru.borodkin.MyFirstTestAppSpringBoot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class MyController {

    private List<String> arrayList = new ArrayList<>();
    private HashMap<Integer, String> hashMap = new HashMap<>();

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello, %s!", name);
    }


    @GetMapping("/update-array")
    public String updateArray(@RequestParam String toArray) {
        if (arrayList == null){
            arrayList = new ArrayList<>();
        }

        arrayList.add(toArray);

        return arrayList.toString();
    }

    @GetMapping("/show-array")
    public List<String> saveArray(){

        return arrayList;
    }

    @GetMapping("/update-map")
    public String updateMap(@RequestParam Integer index, @RequestParam String toMap){
        if (hashMap == null){
            hashMap = new HashMap<>();
        }
        hashMap.put(index, toMap);

        return hashMap.toString();
    }

    @GetMapping("/show-map")
    public HashMap<Integer, String> saveMap(){
        return hashMap;
    }

    @GetMapping("/showAllLength")
    public String showAllLength(){
        return String.format("ArrayList length: %s, HashMap length: %s", arrayList.size(), hashMap.size());
    }





}