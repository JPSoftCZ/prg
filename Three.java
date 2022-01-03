package com.josefpoula.prg;

public class Three {
    static void cvThree() {
        String texts[] = {"pondělí", "úterý", "středa", "čtvrtek", "pátek", "sobota", "neděle"};
        int len = texts.length;

        for (int i = 0; i < len; i++) {
            if (i == 0) {
                System.out.println(texts[0].toUpperCase());
            } else if (i == len-1) {
                System.out.println(texts[len-1].toUpperCase());
            }else {
                System.out.println(texts[i]);
            }
        }
    }
}
