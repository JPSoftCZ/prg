package com.josefpoula.prg;

public class Six {
    static void cvSix() {

        String cislo = "1234";
        String pomPromnenna = "";
        char znak;

        for (int i = 0; i < cislo.length(); i++)
        {
            znak= cislo.charAt(i);
            pomPromnenna= znak+pomPromnenna;
        }
        System.out.println(pomPromnenna);

    }
}
