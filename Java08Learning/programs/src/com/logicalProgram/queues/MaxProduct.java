package com.logicalProgram.queues;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MaxProduct {
    public static void main(String[] args) {
        // Given the array of integers , you will choose two different indices  and  of that array.
        //  Return the maximum value of (nums[i]-1)*(nums[j]-1).
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i=0; 
        while(i<n){
            pq.add(sc.nextInt());
            i++;
        }
        int max1 = pq.poll()-1;
        int max2 = pq.poll()-1;
        System.out.println(max1*max2);
        sc.close();
    }
}
