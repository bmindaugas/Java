package com.company;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        //double[] istorija = {20, 50, 30, 80, 60, 10};


        Scanner daviklis = new Scanner(System.in);
        double pecius;
        double boileris;
        System.out.printf("Peciaus temperatura: ");
        pecius = daviklis.nextDouble();
        System.out.printf("Boilerio temperatura: ");
        boileris = daviklis.nextDouble();

        System.out.println(pecius<boileris? "Boileris ijungta":"Boileris isjungta");

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));

//        if (pecius < boileris){
//            System.out.println("Peciaus temperatura mazesne negu boilerio. Pecius = "+pecius+" < "+boileris+" boilerio ijungta.");
//        }
//        else if (pecius > boileris){
//            System.out.println("Peciaus temperatura didesne negu boilerio. Pecius = "+pecius+" > "+boileris+" boileris isjungta.");
//        }
//        else if (pecius == boileris){
//            System.out.println("Peciaus temperatura lygi boilerio. Pecius = "+pecius+" = "+boileris+" boileris isjungta.");
//        }

    }
}
