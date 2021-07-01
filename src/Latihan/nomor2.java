/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class nomor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String penduduk;
     
        System.out.println("MUHAMMAD HANIF 1 TIC ");
        String warga[][] = {
            {"Hanif", "Jalan Berdikari"}, {"Noel", "Jalan Ubur"},
            {"Fadhil", "Jalan Makmur"},{"Ikhsan","Jalan Lestari"}
        };
        while (true) {
           
            System.out.println("--------------- Menu ---------------");
            System.out.println("1. Mencari Nama Penduduk");
            System.out.println("2. Berhenti");
            System.out.print("Masukkan Pilihan : ");
            int pilihan = sc.nextInt();
            System.out.println();
            
            if (pilihan == 1) {
            System.out.print("Masukkan Nama Penduduk Yang Ingin Di Cari : ");
            penduduk = sc.next();
            for (int i = 0; i < warga.length; i++) {
                for (int j = 0; j < warga[i].length; j++) {
                    if (penduduk.equals (warga[i][j])) {
                        System.out.println("Nama : " +warga[i][j] );
                        System.out.println("Alamat : "  + warga[i][i+1]);
                    } 
                }
            }
            }
            else if(pilihan == 2) {
                System.exit(0);
            }

        }
    }
}
