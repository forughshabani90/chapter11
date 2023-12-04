package CaseStudy1;

import java.util.ArrayList;
import java.util.Objects;

public class MyStack {
    private ArrayList<Objects> list;

    public boolean isEmpty() {
        return true;
    }

    public int getSize() {
        return list.size();
    }

    public Object peek() {
        return list.get(getSize() - 1);
    }

    public Object pop() {
        Object o =list.get(getSize() - 1);
        list.remove(getSize() - 1);
        return o;
    }

    public void push(Objects o) {
        list.add(o);
    }
    public  String toString(){
        return  "stack:" + list.toString();
    }


}
