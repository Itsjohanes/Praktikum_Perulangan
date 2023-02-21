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
public class WhileQuiz {
    public static void main(String[] args){
        int res = 2;
        while(res % 2 != 0 || res % 3 != 0 || res % 4!= 0 || res % 5!= 0){
            res +=1;
        }
        System.out.println(res);
    }
    
}
