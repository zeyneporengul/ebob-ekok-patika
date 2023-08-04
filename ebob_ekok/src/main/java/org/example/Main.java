package org.example;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int x,y, value=1, value_2=0;
        int buyuk=0, kucuk=0;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        x = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        y = input.nextInt();

        if(x>=y){
            buyuk = x;
            kucuk = y;
        } else{
            buyuk = y;
            kucuk = x;
        }

        while(((buyuk*value)%kucuk) != 0){
            value ++;
        }
        System.out.println("EKOK: " + value*buyuk);
        value_2 = kucuk;

        while((buyuk%value_2) != 0){
            do {
                value_2--;
            }
                while((kucuk%value_2) != 0);{
                if ((kucuk % value_2) == 0 && (buyuk % value_2) == 0) {
                    break;
                }
            }
        }
        System.out.println("EBOB: " + value_2);
    }
}