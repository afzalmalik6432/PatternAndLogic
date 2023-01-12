package com.oops.swapTwoObject04;

public class MoviesDriver {
    public static void main(String[] args) {

        System.out.println("Before Swapping");
        Movies a1 = new Movies();
        a1.setDuration(120);
        System.out.println(a1.getDuration());

        Movies a2 = new Movies();
        a2.setDuration(150);
        System.out.println(a2.getDuration());

        swap(a1, a2);
        System.out.println("After Swapping");

        System.out.println(a1.getDuration());
        System.out.println(a2.getDuration());

        System.out.println("Hence value is swapped this shows that java is pass by value and heap changes are persist and pbject creation is temporary");
        
    }
    public static void swap(Movies a1, Movies a2){
        Movies a3 = new Movies();
        a3.setDuration(a1.getDuration());
        a1.setDuration(a2.getDuration());
        a2.setDuration(a3.getDuration());
    }
}
