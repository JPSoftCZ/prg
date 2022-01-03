package com.josefpoula.prg;

public class Eight {
    static void cvEight() {

        String name = "jOsEF poUlA";
        int nameLen = name.length();
        int poziceMezery = name.indexOf(' ');
        char jednotZnak;


        for (int i = 0; i < nameLen; i++) {
            jednotZnak = name.charAt(i);
            if (i == 0){
                jednotZnak = Character.toUpperCase(jednotZnak);
            }
            if (i >= 1) {
                jednotZnak = Character.toLowerCase(jednotZnak);
            }
            if (i >= poziceMezery){
                jednotZnak = Character.toUpperCase(jednotZnak);
            }
            System.out.println(jednotZnak);
        }
    }
}
