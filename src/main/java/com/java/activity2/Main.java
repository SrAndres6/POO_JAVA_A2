package com.java.activity2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // =============================
        // OBJETOS DE TRANSPORTE
        // =============================
        Transporte t1 = new Transporte();
        Transporte t2 = new Transporte(
                "Moto", 
                180, 
                false,
                BigDecimal.valueOf(15000),
                LocalDate.of(2022, 5, 20),
                new Casa()
        );

        System.out.println(t1);
        System.out.println(t2);

        // =============================
        // OBJETOS DE RED SOCIAL
        // =============================
        RedSocial r1 = new RedSocial();
        RedSocial r2 = new RedSocial(
                "Instagram",
                2010,
                true,
                LocalDate.now(),
                10000000,
                List.of("Hola mundo", "Mi primera foto")
        );

        System.out.println(r1);
        System.out.println(r2);

        // =============================
        // OBJETOS DE CASA
        // =============================
        Casa c1 = new Casa();
        Casa c2 = new Casa(
                "Calle 50 #10-20",
                4,
                true,
                LocalDate.of(2018, 6, 15),
                BigDecimal.valueOf(350000),
                true
        );

        System.out.println(c1);
        System.out.println(c2);
    }
}
