package com.Arrays;

import java.util.*;

public class Sublist {

    public static void main(String[] args) {

        List<String> x = new ArrayList<>();
        x.add("a");
        x.add("b");
        x.add("c");
        x.add("d");
        x.add("e");

        // `subList(int fromIndex, int toIndex)`
        // array indexes start at 0.
        // 1st arg is inclusive (included), 2nd arg is exclusive (not included).
        List a = x.subList(0,1);  // [a]
        List b = x.subList(0,2);  // [a, b]
        List c = x.subList(0,4);  // [a, b, c, d]      # same as `x.subList(0,x.size()-1)`
        List d = x.subList(0,5);  // [a, b, c, d, e]   # same as `x.subList(0,x.size())`
        List e = x.subList(0,6);  // IndexOutOfBoundsException
        List f = x.subList(1,1);  // f []
        List g = x.subList(1,2);  // g [b]
        List h = x.subList(2,5);  // h [c, d, e]
        
    }
}