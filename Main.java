import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int sayi,i,sayac=0,toplam=0;
        double ort;

        System.out.print("Sayi giriniz:");
        sayi=input.nextInt();

        for( i=0 ; i<=sayi ; i++){
            if(i %3 ==0 && i %4 ==0){
                sayac++;
                toplam+=i;
            }
        }

        ort=toplam/sayac;
        System.out.println("3'e ve 4'e tam bolunen sayilarin ortalamasi " + ort + "'dir.");

    }
}