/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giantcokkie;

import java.util.Scanner;

/**
 *
 * @author zhuan
 */
public class GiantCokkie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int r=n%m;
        System.out.println(r==0?"yes "+n/m:"no "+additionalPeople(n,m));
    }

    private static int additionalPeople(int n, int m) {
        int i=1;
        while (n%(m+i)!=0) i++;
        return i;
    }
}
