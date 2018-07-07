package com.company;

//import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  String[] vardas = {"Jonas", "Petras", "Jurgis"};
  String[] pavarde = {"Jonaitis", "Petraitis", "Jurgaitis"};

  double[] trimestras = {8,9,8,10};
  double vidurkis;
  double suma = 0;

  for (int i=0; i<trimestras.length; i++){

    suma = trimestras[i] + suma;
  }
  vidurkis = suma / trimestras.length;
    System.out.println(vardas +" "+ pavarde +" "+ vidurkis);

    // write your code here



//    Papildoma obj = new Papildoma("Laura");
//    Scanner klaviatura = new Scanner(System.in);
//    System.out.println("Iveskite savo varda");
//    String vardas = klaviatura.nextLine();
//    Papildoma objektas = new Papildoma();
//    objektas.zinute(vardas);

    //    double num1, num2;
//    double ats;
//    System.out.println("iveskite pirmaji skaiciu ");
//    num1 = klaviatura.nextDouble();
//    System.out.println("iveskite antraji skaiciu ");
//    num2 = klaviatura.nextDouble();
//
//    ats = num1 / num2;
//    System.out.println("Atsakymas" + ats);

  }
}
