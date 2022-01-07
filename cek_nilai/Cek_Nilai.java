/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cek_nilai;

import java.util.Scanner;

/**
 *
 * @author Daniel Setiawan Jaya
 */
public class Cek_Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai = ");
        nilai = input.nextInt();
        
        if(nilai <= 100){
            System.out.println("Absah");
        }else{
            System.out.println("Tidak Absah");
        }
        
    }
    
}
