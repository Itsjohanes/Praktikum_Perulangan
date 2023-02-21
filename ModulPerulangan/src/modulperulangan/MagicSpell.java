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
public class MagicSpell {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        boolean isMagic = true;
        isMagic = magic(x);
        while(isMagic){
            x = sc.nextLine();
            isMagic = magic(x);
        }
        System.out.println("Sudah Selesai");
        
    }
    public static boolean magic(String x){
        
        char x1 = x.charAt(0);
        int panjang = x.length()-1;
        char x2 = x.charAt(panjang);
        int angkaX1 = (int)x1;
        int angkaX2 = (int)x2;
        int selisih = Math.abs(angkaX1-angkaX2);
        if(x1 == x2){
            return true;
        }else if(selisih == 1){
            return true;
        }else{
            return false;
        }
        
        
    }
    
}
