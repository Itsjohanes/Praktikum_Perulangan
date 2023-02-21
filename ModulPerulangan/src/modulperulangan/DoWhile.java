/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulperulangan;

/**
 *
 * @author acer
 */
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int pilihan,a,b;
        do{
            a= sc.nextInt();
            b = sc.nextInt();
            pilihan = sc.nextInt();
            if(pilihan == 1){
                System.out.println(a-b);
            }else if(pilihan == 2){
                System.out.println(a+b);
             
                
            }
        }while(pilihan == 1 || pilihan == 2);
    }
}
