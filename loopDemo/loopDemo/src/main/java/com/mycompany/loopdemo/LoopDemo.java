package com.mycompany.loopdemo;

public class LoopDemo {

    public static void main(String[] args) {

        for(int i=2; i<10; i+=2){
            System.out.println(i);
        }
        System.out.println("For dongusu bitti");
        
        
        
        //While
        int i = 2;
        
        while(i<10){
          System.out.println(i);
          i+=2;
        }
        System.out.println("While dongusu bitti");
        
        
        
        //Do-While
        int j = 100;
        do{
            System.out.println("Loglandi");
            System.out.println(j);
            j+=2;
        } while(j<10);
          System.out.println("Do-While dongusu bitti");
        }
    }
