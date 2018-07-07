package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        String vardas;
        double ugis;
        int amzius;

        Scanner klaviatura = new Scanner(System.in);

        System.out.println("Iveskite savo varda: ");
        vardas = klaviatura.nextLine();

        System.out.println("Iveskite savo amziu: ");
        amzius = klaviatura.nextInt();

        System.out.println("Iveskite savo ugi: ");
        ugis = klaviatura.nextDouble();

        System.out.println("Jusu vardas yra "+vardas);
        System.out.println("Jusu ugis yra "+ugis);
        System.out.println("Jusu amzius yra "+amzius);
    }
}
