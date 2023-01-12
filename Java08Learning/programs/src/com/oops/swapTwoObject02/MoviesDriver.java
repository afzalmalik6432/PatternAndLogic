package com.oops.swapTwoObject02;

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

        System.out.println("Hence value is not swapped this shows that java is pass by value as well as we create a new object but this object is deleted as stack call is deleted");
        
    }
    public static void swap(Movies a1, Movies a2){
        Movies a3 = new Movies();
        a3.setDuration(a1.getDuration());
        a1 =a2;
        a2 = a3;
    }
}
