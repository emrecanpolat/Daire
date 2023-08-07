package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double pi=3.14, cevre, alan;


        Scanner input = new Scanner(System.in);
        System.out.println("Yarı çapı giriniz;");
        double yariCap = input.nextInt();

        cevre = 2*pi*yariCap;
        alan = pi*yariCap*yariCap;

        System.out.println("Dairenin alanı: "+ alan);
        System.out.println("Dairenin cevresi: "+ cevre);

    }
}
