package com.kgisl.unittest;

import java.util.*;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

/**
 * Comma
 */
public class Comma {

    public static void main(String[] args) {
        String commaSeparated = "item1 , item2 , item3";

        // ArrayList conv = new ArrayList(Arrays.asList(commaSeparated.split(",")));
        // for (int i = 0; i < conv.size(); i++) {
        //     System.out.println(conv.get(i));
        // }

        
ArrayList<String> conv1 = new  ArrayList<String>(Arrays.asList(commaSeparated.split(",")));
System.out.println(conv1);

        

    }

}
