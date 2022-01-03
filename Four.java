package com.josefpoula.prg;

public class Four {
    static void cvFour() {
        String text = "Halloween";
        boolean state = false;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == text.charAt(i + 1)){
                state = true;
                break;
            }
        }

        if (state) {
            System.out.println("Slovo obsahuje po sobě jdouví písmena");
        } else {
            System.out.println("Slova zdvojená písmena neobsahuje");
        }
    }
}
