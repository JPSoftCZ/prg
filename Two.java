package com.josefpoula.prg;

public class Two {

    static void cvTwo() {
        String text = "text";
        char znak;
        int delka = text.length();
        boolean znk = false;

        for (int i = 0; i < delka; i++) {
            znak = text.charAt(i);
            if (Character.isLowerCase(znak)) {
                znk = true;
            } else if (Character.isUpperCase(znak)) {
                znk = false;
                break;
            }
        }

        if (znk) {
            System.out.println(text.toUpperCase());
        } else {
            System.out.println(text);
        }





    }

}
