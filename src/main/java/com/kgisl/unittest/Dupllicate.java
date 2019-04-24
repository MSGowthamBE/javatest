package com.kgisl.unittest;

import java.util.ArrayList;
import java.util.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Dupllicate
 */
public class Dupllicate {

    public static void main(String[] args) {
        ArrayList<String> duplicateWord = new ArrayList<String>();

        duplicateWord.add("CSK");
        duplicateWord.add("RR");
        duplicateWord.add("MI");
        duplicateWord.add("SRH");
        duplicateWord.add("CSK");
        duplicateWord.add("RR");
        duplicateWord.add("KTK");
        duplicateWord.add("PWI");

        ArrayList<String> notDuplicate = new ArrayList<String>();

        Iterator<String> duplicate = duplicateWord.iterator();
        while (duplicate.hasNext()) {
            String dupWord = duplicate.next();
            if (notDuplicate.contains(dupWord)) {
                duplicate.remove();
            } else {
                notDuplicate.add(dupWord);
            }
        }
        System.out.println(notDuplicate);
    }
}