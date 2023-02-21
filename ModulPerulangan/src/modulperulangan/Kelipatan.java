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
public class Kelipatan {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int benar = 0;
        System.out.print("Y: "); int i = sc.nextInt();
        int j;
        do{
            j = sc.nextInt();
            if(j % i == 0){
                benar++;
            }
            
        }while(j % i == 0);
        
        System.out.println("Jumlah jawaban Benar: " + benar);
    }
    
}
