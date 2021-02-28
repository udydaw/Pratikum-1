/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum1;

import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);

        Lingkaran lingkaran = new Lingkaran();
        Persegi persegi = new Persegi();

        System.out.println("====MEDIA MENGHITUNG LUAS BANGUN DATAR====");
        System.out.println("             Selamat Datang");
        System.out.println("");
        System.out.println("Silahkan memilih :>");
        System.out.println("1. Luas Bangun Lingkaran");
        System.out.println("2. Luas Bangun Persegi");
        System.out.println("Pilihan Anda: ");
        int inputluas  = input.nextInt();

        switch (inputluas) {
            case 1:
                System.out.println("");
                System.out.println("Jari-jari lingkaran = ");
                double jarijari = input.nextDouble();
                lingkaran.menghitungluas(jarijari);
                break;
            case 2:
                System.out.println("");
                System.out.println("Panjang sisi persegi = ");
                double sisi = input.nextDouble();
                persegi.menghitungluas(sisi);
                break;
            default:
                System.out.println("Akan ada bangun lain besok hari, stay tunee!");
        }
    }
}
