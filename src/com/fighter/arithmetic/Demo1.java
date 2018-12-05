package com.fighter.arithmetic;

import java.util.ArrayList;
import java.util.List;

public class Demo1 {

    public static final String s1 = "11";

    public static void main(String[] args) {

        String s2 = new StringBuilder("11").toString();
        System.out.println(s1 == s2);
        test1();
        test3();
        List list = new ArrayList();
        list.remove("2");

        int i2 = 1;
        System.out.println("" + (i2-- > 0));

        loop:
        for (int i = 0; i < 10; i++) {
            String s = "" + i;
//            switch (s) {
//                case "3":
//                    break loop;
//                case "2":
//                    break;
//            }
            for (int i1 = 0; i1 < 20; i1++) {
                if (i1 == 8) {
                    break loop;
                }
                System.out.println("nei:" + i1);
            }
            System.out.println("di:" + i);
        }
    }

    public static boolean test1() {
        try {
            return true && test2();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public static boolean test2() {
        throw new IllegalArgumentException("xxxxx");
    }

    public static void test3() {
        System.out.println(Math.abs(-655366666));
    }

}