/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resume;

import java.util.Scanner;
 
public class Resume {

  

public static void main(String[] args) {
    
    Scanner c = new Scanner(System.in);
    System.out.print("Input Your rows : ");
        int rows = c.nextInt();
    for(int i = rows; i >= 1; --i) {
      for(int x = 1; x <= rows - i; ++x) {
        System.out.print("  ");
      }

      for(int j=i; j <= 2 * i - 1; ++j) {
        System.out.print("* ");
      }

      for(int j = 0; j < i - 1; ++j) {
        System.out.print("* ");
      }

      System.out.println();
    }
  }
}

       