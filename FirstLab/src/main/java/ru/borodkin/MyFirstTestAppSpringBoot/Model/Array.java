package ru.borodkin.MyFirstTestAppSpringBoot.Model;

import java.util.ArrayList;


public class Array {
    private ArrayList<String> list;

    public ArrayList<String> getList() {
        return list;
    }

    public void setList(String list) {
        this.list.add(list);
    }
}
