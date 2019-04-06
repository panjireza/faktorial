/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belah.ketupat;

import java.util.Scanner;

/**
 *
 * @author Praktikan
 */
public class BelahKetupat {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner show = new Scanner(System.in);
        
        
        System.out.print("Masukkan angka : ");
        int n = show.nextInt();
        
         for (int i=1;i<=n;i++){
             for(int j=n;j>=i;j--){
                 System.out.print("0");
             }
             for(int k=1;k<=i;k++){
                 System.out.print("*");
             }
             for (int l=1;l<=i-1;l++){
                 System.out.print("*");
             }
             System.out.println("");
         }
   for (int i=1;i<=5;i++){
             for(int j=1;j<=i-1;j++){
                 System.out.print("0");
             }
             for(int z=5;z>=i;z--){
              System.out.print("*");
              }
             for(int k=4;k>=i;k--){
               System.out.print("*");
               }
             System.out.println("");
         }

  } 
}
