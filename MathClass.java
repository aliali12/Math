package com.company;

import java.lang.Math;

public class MathClass {
    public static void main (String[] args ){
        double x = 14.26;
        double y = 1.22;
        double z = 3.5 * Math.pow(10, -2);

        double fir = 2 * Math.cos(x - 2.0 / 3.0);
        double sec = 1.0 / 2.0 + Math.pow(Math.sin(y), 2);
        double thi = 1 + Math.pow(z, 2) / 3 - Math.pow(z , 2) / 5;


        double s = fir / sec * thi;
        System.out.println(s);
    }
}