package com.kgisl.unittest;


import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

/**
 * ArrayListString
 */
public class ArrayListString {
    public static void main(String[] args) {

        // ArrayList<String> covert = new ArrayList<String>();
        String[] stringArray = { "Good", "Bad", "Calm", "New", "End" };
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(stringArray));
        // String[] strArr = new String[arrayList.size()];
        // arrayList.toArray(strArr);
        for (String var : arrayList)
            System.out.println(var);
            
        // String[] arr = list.toArray(new String[list.size()]);

    }
}