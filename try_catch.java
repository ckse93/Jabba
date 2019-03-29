package com.company;

public class Main {
    public static void main(String[] args) {
        int[] threeArray = new int[3];
        try {
            for (int i = 0 ; i < threeArray.length+1 ; i++) { // it will go out of bound 
            threeArray[i] = i+1;
            System.out.println(threeArray[i]);
        }
        }
        catch (Exception e){
            System.out.println("there was an error\n");
        }
    }
}
