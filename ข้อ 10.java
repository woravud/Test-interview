/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resume2;

import java.util.Scanner;

/**
 *
 * @author lenovo
 */
public class Resume2 {

  

  public static void main(String[] args) {
    int k=0;
      Scanner x = new Scanner(System.in);
    System.out.print("Input Your rows : ");
        int rows = x.nextInt();
    
for (int i = 1; i <= rows; ++i, k = 0) {
      for (int space = 1; space <= rows - i; ++space) {
        System.out.print("  ");
      }

      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }

      System.out.println();
    }
  }
}


  

    

