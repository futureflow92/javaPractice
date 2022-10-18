package com.java.javapractice.ch09_java.langPackage_utilClasses;

import org.apache.logging.log4j.util.Strings;

import java.util.Arrays;
import java.util.StringJoiner;

public class StringEx4 {
    public static void main(String[] args) {
        String animals = "dog, cat, bear";
        String[] arr = animals.split(",");

        System.out.println(Arrays.toString(arr));

        System.out.println(String.join("-", arr));
        StringJoiner sj = new StringJoiner("/", "[", "]");
        for (String s : arr) {
            sj.add(s);
        }
        System.out.println(sj.toString());
    }
}
