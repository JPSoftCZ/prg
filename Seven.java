package com.josefpoula.prg;

import java.util.Locale;

public class Seven {
    static void cvSeven() {
        String retezec = "programování";
        int len = retezec.length();

        for (int i = 0; i < len; i++){
            if (i % 2 == 0 ) {
                System.out.println(retezec.toUpperCase().charAt(i));
            } else {
                System.out.println(retezec.toLowerCase().charAt(i));
            }
        }


    }
}
