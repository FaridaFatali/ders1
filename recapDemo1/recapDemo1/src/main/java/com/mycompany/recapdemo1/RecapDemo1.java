package com.mycompany.recapdemo1;


public class RecapDemo1 {

    public static void main(String[] args) {
        int sayi1 = 24;
        int sayi2 = 25;
        int sayi3 = 2;
        int enBuyuk = sayi1;
        
        if(enBuyuk<sayi2){
            enBuyuk = sayi2;
        }
        
        if(enBuyuk<sayi3){
            enBuyuk = sayi3;
        }
        
        System.out.println("En buyuk = " + enBuyuk);
        
        
        
        
        
        if(sayi1>sayi2){
            System.out.println("En buyuk rakam:" +  sayi1);
        } else if(sayi2>sayi3){
            System.out.println("En buyuk rakam:" + sayi2);
        } else {
            System.out.println("En buyuk rakam:" + sayi3);
        }
    }
}
