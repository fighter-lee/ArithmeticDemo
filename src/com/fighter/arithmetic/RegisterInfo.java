package com.fighter.arithmetic;

import static java.lang.Thread.sleep;

public class RegisterInfo {

    public String name;
    public String name2;

    public void vaild() {
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void exe() {
        try {
            System.out.println("exe start");
            sleep(2000);
            System.out.println("exe end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
