package com.fighter.arithmetic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Demo2 {

    public static void main(String[] args) {

//        for (int i = 0; i < 10; i++) {
//            System.out.println("start:"+i);
//            if (i == 5){
//                return;
//            }
//            System.out.println("end:"+i);
//        }
//        System.out.println("end end");

        List<String> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i + "");
        }
        Iterator<String> iterator = integers.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println("yyyyyyyy"+next);
            if (next.equals("2")) {
                iterator.remove();
            }
        }

        for (String integer : integers) {
            System.out.println("xxxxxxxx:"+integer);
        }

        List<RegisterInfo> registerInfos = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            RegisterInfo registerInfo1 = new RegisterInfo();
            registerInfo1.name = "name:"+i;
            registerInfos.add(registerInfo1);
        }
        List<RegisterInfo> registerInfos2 = new ArrayList<>();
        registerInfos2.addAll(registerInfos);
        RegisterInfo registerInfox;
        for (RegisterInfo registerInfo2 : registerInfos2) {
            registerInfox = registerInfo2;
            if (registerInfox.name.equals("name:3")){
                registerInfox.name2 = "namexxxxxx";
            }
        }
        for (RegisterInfo registerInfo : registerInfos) {
            System.out.println(registerInfo.name+"//////"+registerInfo.name2);
        }
    }
}
