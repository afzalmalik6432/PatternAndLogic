package com.logicalProgram.queues;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class MaxDiamonds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int i=0;
        while(i<n){
            pq.add(sc.nextInt());
            i++;
        }

        int steps = sc.nextInt();
        int j=0;
        int collectedDiamond = 0;
        while(j<steps){
            int diamond = pq.poll();
            collectedDiamond = collectedDiamond+diamond;
            pq.add(diamond/2);
            j++;
        }
        System.out.println(collectedDiamond);
        sc.close();
    }
}
