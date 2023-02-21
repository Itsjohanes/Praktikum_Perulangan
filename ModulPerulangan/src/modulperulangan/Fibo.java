/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulperulangan;

import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Fibo {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,angka;
        angka = 0;
        int masukan = sc.nextInt();
        for(i = 1;i<= masukan;i++){
            angka = angka + i;
            System.out.print(angka + " ");
            
        }
        
    }
    
}
