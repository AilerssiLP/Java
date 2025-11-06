package Algorithms;

import java.math.BigInteger;
//import java.util.Scanner;

public class alg2 {


    public static void run(String num1, String num2) {

        //System.out.println("Give me first number!");
        //Scanner scanner = new Scanner(System.in);
        //BigInteger name1 = scanner1.nextBigInteger();
        BigInteger name = new java.math.BigInteger(num1);
        BigInteger name2 = new java.math.BigInteger(num2);

        //System.out.println("Give me second number!");
        //Scanner scanner2 = new Scanner(System.in);

        //BigInteger name2 = scanner2.nextBigInteger();

        BigInteger result = name.multiply(name2);

        System.out.printf("output: %n%d",result);
        //scanner.close();
        //scanner2.close();
    }
}