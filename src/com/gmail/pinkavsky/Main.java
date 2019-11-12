package com.gmail.pinkavsky;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Month Jan = new Month("January");
        Month Feb = new Month("February");
        Month Mar = new Month("March");
        Month Apr = new Month("April");
        Month May = new Month("May");
        Month Jun = new Month("June");
        Month Jul = new Month("July");
        Month Aug = new Month("August");
        Month Sep = new Month("September");
        Month Oct = new Month("October");
        Month Nov = new Month("November");
        Month Dec = new Month("December");

        HashMap<Product, HashMap> line = new HashMap<>();

        HashMap<Month, String> col1=new HashMap<>();
        HashMap<Month, String> col2=new HashMap<>();
        HashMap<Month, String> col3=new HashMap<>();

        Product pr1 = new Product("Product1", line);
        Product pr2 = new Product("Product2", line);
        Product pr3 = new Product("Product3", line);

        col1.put(Jan, "Num1");
        col1.put(Feb, "Num2");
        col1.put(Mar, "Num3");
        col1.put(Apr, "Num4");
        col1.put(May, "Num5");
        col1.put(Jun, "Num6");
        col1.put(Jul, "Num7");
        col1.put(Aug, "Num8");
        col1.put(Sep, "Num9");
        col1.put(Oct, "Num10");
        col1.put(Nov, "Num11");
        col1.put(Dec, "Num12");

        col2.put(Jan, "Num13");
        col2.put(Feb, "Num14");
        col2.put(Mar, "Num15");
        col2.put(Apr, "Num16");
        col2.put(May, "Num17");
        col2.put(Jun, "Num18");
        col2.put(Jul, "Num19");
        col2.put(Aug, "Num20");
        col2.put(Sep, "Num21");
        col2.put(Oct, "Num22");
        col2.put(Nov, "Num23");
        col2.put(Dec, "Num24");

        col3.put(Jan, "Num25");
        col3.put(Feb, "Num26");
        col3.put(Mar, "Num27");
        col3.put(Apr, "Num28");
        col3.put(May, "Num29");
        col3.put(Jun, "Num30");
        col3.put(Jul, "Num31");
        col3.put(Aug, "Num32");
        col3.put(Sep, "Num33");
        col3.put(Oct, "Num34");
        col3.put(Nov, "Num35");
        col3.put(Dec, "Num36");

        line.put(pr1, col1);
        line.put(pr2,col2);
        line.put(pr3,col3);

        System.out.println(pr1.find(Jan, pr1));



    }
}
