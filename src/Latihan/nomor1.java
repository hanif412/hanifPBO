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
public class nomor1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        /* MUHAMMAD HANIF 1TIC */
        int byk;  
        System.out.print("Masukkan Jumlah Mahasiswa: ");
        byk = sc.nextInt();
        
        String namakelas [][] = new String[byk][2];
        
         for(int a= 0; a<byk; a++){
            System.out.println("");
            System.out.println("Mahasiswa ke "+(a+1));
            for(int b=0;b<2;b++){      
                if (b == 0)
                    System.out.print("Nama Mahasiswa  : ");
                else
                    System.out.print("Kelas Mahasiswa : ");
                
                System.out.print("");
                namakelas[a][b] = sc.next();
            }
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Nama Mahasiswa\t\tKelas Mahasiswwa");
        System.out.println("------------------------------------------------");
        
        for(int i=0;i<byk;i++){
            for(int j=0;j<2;j++) {
                System.out.print(namakelas[i][j]+ "\t\t\t" );
            }
        System.out.println();
        }
         
    }
}
