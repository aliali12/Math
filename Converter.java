package com.company;

import java.util.Scanner;

public class Converter{
    public static void main (String[] args){
        System.out.println("This application converts decimal numbers to binary,octal,and Hexadecimal");
        Scanner input = new Scanner( System.in );

        while (true) {
            System.out.print("Enter a value to convert to binary : ");
            int number =input.nextInt();
            System.out.print("Enter a value to convert to octal : ");
            int secondNumber=input.nextInt();
            System.out.print("Enter a value to convert to hexadecimal : ");
            int thirdNumber =input.nextInt();

            int binrem;
            int octarem;
            int hexarem;
            StringBuilder bin = new StringBuilder();
            StringBuilder octa = new StringBuilder();
            StringBuilder hexa= new StringBuilder();
            char[] hexadecimal ={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

            if (number <= 0 ) {
                System.out.println("The decimal value must be greater than zero!");
                break;
            }
            else if (secondNumber <=0){
                System.out.println("The decimal value must be greater than zero!");
                break;
            }
            else if  (thirdNumber <=0){
                System.out.println("The decimal value must be greater than zero!");
                break;
            }
            while (number > 0)
            {
                binrem=number%2;
                bin.insert(0, binrem);
                number=number/2;
            }
            while (secondNumber > 0)
            {
                octarem=secondNumber%8;
                octa.insert(0, octarem);
                secondNumber=secondNumber/8;
            }
            while (thirdNumber > 0)
            {
                hexarem=thirdNumber%16;
                hexa.insert(0, hexadecimal[hexarem]);
                thirdNumber=thirdNumber/ 16;
            }
            System.out.println("binary number is " + bin);
            System.out.println("octa number is " + octa);
            System.out.println("hexadecimal number is " + hexa);
        }
    }
}
