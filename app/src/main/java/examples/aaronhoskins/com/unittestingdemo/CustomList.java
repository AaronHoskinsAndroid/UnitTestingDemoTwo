package examples.aaronhoskins.com.unittestingdemo;

import java.util.ArrayList;

public class CustomList {
    public ArrayList<String> list;

    public CustomList() {
        list = new ArrayList<>();
    }

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int size() {
        return 0;
    }

    public String get(int index) {
        return null;
    }

    public void remove(int index){

    }

    public void insert(String s1) {
        list.add(s1);
    }
}
