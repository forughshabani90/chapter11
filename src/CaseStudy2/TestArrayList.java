package CaseStudy2;

import listing.Circle;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("london");
        cityList.add("denver");
        cityList.add("paris");
        cityList.add("miami");
        cityList.add("seoul");
        cityList.add("Tokyo");
        System.out.println("listSize?" + cityList.size());
        System.out.println("is miami in the list?" + cityList.contains("miami"));
        System.out.println("the location of denver in the list ?" + cityList.indexOf("denver"));
        System.out.println("is the list empty?" + cityList.isEmpty());
        cityList.add(2, "xian");
        cityList.remove("miami");
        cityList.remove(1);
        System.out.println(cityList.toString());
        for (int i = cityList.size() - 1; i >= 0; i--)
            System.out.println(cityList.get(i) + " ");
        System.out.println();
        ArrayList<Circle> list = new ArrayList<>();
        list.add(new Circle(2));
        list.add(new Circle(3));
        System.out.println("the area of the circle?" + list.get(0).getArea());

    }
}
