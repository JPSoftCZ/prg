package com.josefpoula.prg;

public class Nine {
    static void cvNine() {
        long rodneCislo = 6562748747L;

        String prevod = String.valueOf(rodneCislo);
        String numOne = String.valueOf(prevod.charAt(2));
        String numTwo = String.valueOf(prevod.charAt(3));
        String mm = numOne + numTwo;

        int mmFi = Integer.parseInt(mm);

        System.out.println("Pohlaví rodného čísla " + rodneCislo + " je: ");
        if (mmFi >= 51) {
            System.out.println("Žena");
        } else {
            System.out.println("Muž");
        }
    }
}
