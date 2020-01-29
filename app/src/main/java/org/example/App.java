package org.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App{
    public static void main( String[] args ){
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Jason");
        names.add("Mary");
        names.add("Stan");

        System.out.println("Names: " + names);
    }
}
