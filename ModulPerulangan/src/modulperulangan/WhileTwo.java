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
public class WhileTwo {
    public static void main(String[] args){
        int i =1; 
        String result = "";
        while(i <= 10){
            result += i + " ";
            i+=2;
        }
        System.out.println(result);
    }
}
