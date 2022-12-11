package com.logicalProgram.queues;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeSortedArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0; i<n; i++){
            int k=sc.nextInt();
            for(int j=0; j<k; j++){
                pq.add(sc.nextInt());
            }
        }
        while(pq.size()>0){
            System.out.print(pq.poll()+" ");
        }
        sc.close();
    }
}
