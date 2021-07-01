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
public class nomor3 {
    public static void main(String[] args){
        
        int bilangan [][]= {
                           {2,2,2,2,2,2,2,2,2,2},
                           {1,1,1,1,1,1,1,1,1,1},
                           {2,2,2,2,2,2,2,2,2,2},
                           {1,1,1,1,1,1,1,1,1,1},
                           {2,2,2,2,2,2,2,2,2,2},
                           {1,1,1,1,1,1,1,1,1,1},
                           {2,2,2,2,2,2,2,2,2,2},
                           {1,1,1,1,1,1,1,1,1,1},
                           {2,2,2,2,2,2,2,2,2,2},
                           {1,1,1,1,1,1,1,1,1,1}
                                                  };
        System.out.println(" MUHAMMAD HANIF 1TIC ");
        int jumlah = 0;
        int baris [] = new int [bilangan.length];
        int kolom [] = new int [bilangan.length];
        
        for(int i = 0; i < bilangan.length;i++){
            
            for(int j =0; j<bilangan[i].length;j++){
           jumlah += bilangan[i][j];  
                 
           kolom[i] += bilangan[j][i];  
           baris[i] += bilangan[i][j];  
            } 
            System.out.println("Total Bilangan Kolom ke " + (i+1) + " = " + kolom[i]);
            System.out.println("Total Bilangan Baris ke " + (i+1) + " = " + baris[i]);
            System.out.println();
        }
        System.out.println("Jumlah Seluruh Bilangan " + jumlah);
     

        } 
}
