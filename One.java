package com.josefpoula.prg;

import java.util.Arrays;

public class One {

    static void cvOne() {
        String jmena[] = {"Martin", "Lukáš", "Josef","Adam", "Vašek", "Petr", "Patrik"};
        String uzivJmeno = "Josef";
        boolean auth = Arrays.asList(jmena).contains(uzivJmeno);

        if (auth == true) {
            System.out.println("Jméno se nachází v řetěžci");
        } else {
            System.out.println("Jméno se v řetězci nenachází");
        }
    }
}
