/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author Nguyen Van Si
 */
import java.util.*;
public class BaiTap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Cac so do la : ");
           for (int i=2;i<10;i++) {
            if(i%2==0) {
            System.out.print(" " +i);
        }
    }
           System.out.println("");
        System.out.print("So phan tu cua mang la :  ");
    int n;
    Scanner sc =new Scanner(System.in);
    n=sc.nextInt();
    int arr[] = new int[n];
   
    for (int i=0;i<n;i++) {
        System.out.print("Phan tu thu " +(i+1)+" la :");
        arr[i]=sc.nextInt();
    }
    for (int i=0;i<n;i++){
        for (int j=i+1;j<n;j++) {
            if(arr[i]>arr[j]){
                int k= arr[i];
                arr[i]=arr[j];
                arr[j]=k;
            }
        }
    }
        System.out.println("Mang da sap xep : ");
    for (int i=0;i<n;i++) {
        System.out.print(" " + arr[i]);
        
    }System.out.println("");
        System.out.println( "So lon nhat trong mang la : " + arr[n-1]);
}
}
    
