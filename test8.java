
 
package resume4;

import java.util.Scanner;


public class Resume4 {

   
    public static void main(String[] args) {
        int money;
        while(true){
            try{
                Scanner in = new Scanner(System.in);
                System.out.print("Money to chang : ");
                money = in.nextInt();
               
                if(money >= 0) break;
            }
            catch(Exception e){}
        }
        int[] pay = new int[7];
             money = 1000 - money ;
        int[] numpay = new int[]{500, 100, 50, 20, 10, 5, 1};
        for (int i= 0; i < pay.length; i++) {
            pay[i] = money/numpay[i];
            money = money%numpay[i];
        }

        System.out.println("500 is : " + pay[0]);
        System.out.println("100 is : " + pay[1]);
        System.out.println("50 is : " + pay[2]);
        System.out.println("20 is : " + pay[3]);
        System.out.println("10 is : " + pay[4]);
        System.out.println("5 is : " + pay[5]);
        System.out.println("1 is : " + pay[6]);
    }
}
