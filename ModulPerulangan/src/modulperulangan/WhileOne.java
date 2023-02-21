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
import java.util.*;
public class WhileOne {
    public static void main(String[] args){
        int result = 0;
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        while(num1>= num2){
            num1 -= num2;
            result += 1;
        }
        System.out.println(result);
    }
}
