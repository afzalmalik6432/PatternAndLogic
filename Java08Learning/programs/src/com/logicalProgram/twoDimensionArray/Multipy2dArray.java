package com.logicalProgram.twoDimensionArray;

import java.util.Scanner;

public class Multipy2dArray {

    public static int[][] multiplyArray(int[][] arr1, int[][]arr2){
        int row1 = arr1.length;
        int col1 = arr1[0].length;
        // int row2 = arr2.length;
        int col2 = arr2[0].length;
        int[][] mul = new int[row1][col2];

        for(int i=0;i<row1;i++){
            for(int j=0;j<col2;j++){
                for(int k=0;k<col1;k++){
                    mul[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        return mul;
    }

    public static void printArray(int[][] arr){
        for(int i=0; i<arr.length;i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        int [][]arr1 = new int[row1][col1];
        for(int i=0; i<row1; i++){
            for(int j=0; j<col1; j++){
                arr1[i][j]=sc.nextInt();
            }
        }
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int [][]arr2 = new int[row2][col2];
        for(int i=0; i<row2; i++){
            for(int j=0; j<col2; j++){
                arr2[i][j]=sc.nextInt();
            }
        }
        sc.close();
        if(col1 != row2){
            System.out.println("Multiplication not possible due to in correct dimensions");
            return;
        }
        int[][] result = multiplyArray(arr1,arr2);
        printArray(result);
    }
}
