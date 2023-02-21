/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulperulangan;
import java.util.*;
/**
 *
 * @author acer
 */
public class pola {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int i,j;
        int masukan = sc.nextInt();
        for(i = 1;i<=5;i++){
            
            for(j = 5; j>= i;j--){
                System.out.print(j);
            }
            System.out.println("");
            
        }
        
        
        
    }
}
