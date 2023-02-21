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
public class LoopInsideWhile {
    public static void main(String[] args) {

    int weeks = 3;
    int days = 7;
    int i = 1;

    // outer loop
    while (i <= weeks) {
      System.out.println("Week: " + i);

      // inner loop
      for (int j = 1; j <= days; ++j) {
        System.out.println("  Days: " + j);
      }
      ++i;
    }
  }
}
