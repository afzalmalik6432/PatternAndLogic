package com.patterns;
    import java.util.Scanner;

    public class Pattern15 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n=sc.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                for(int k=n; k>=i+1;k--){
                    System.out.print(" ");
                }
                for(int k=n; k>=i+1;k--){
                    System.out.print(" ");
                }
                for(int j=i; j>=1; j=j-1){
                    System.out.print("*");
                }
                System.out.println();
            }

            for(int i=n-1;i>=1;i--){
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                for(int k=n; k>=i+1;k--){
                    System.out.print(" ");
                }
                for(int k=n; k>=i+1;k--){
                    System.out.print(" ");
                }
                for(int j=i; j>=1; j=j-1){
                    System.out.print("*");
                }
                System.out.println();
            }
            sc.close();
        }
    }
