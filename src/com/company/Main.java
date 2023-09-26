package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  int n1, n2, select;

      Scanner inp=new Scanner(System.in);

        System.out.println("Lütfen Yapmak istediğiniz işlemi seçin,\n 1-Toplam\n 2-Çıkarma\n 3-Çarpma\n 4-Bölme\n");
        select=inp.nextInt();


        switch (select){
            case 1:
                System.out.println("Lütfen Birinci Sayıyı Giriniz:");
                n1=inp.nextInt();
                System.out.println("Lütfen İkinci Sayıyı giriniz:");
                n2=inp.nextInt();
                int Toplam=n1+n2;
                System.out.println("Toplama İşleminin Sonucu:"+Toplam);
                break;
            case 2:
                System.out.println("Lütfen Birinci Sayıyı Giriniz:");
                n1=inp.nextInt();
                System.out.println("Lütfen İkinci Sayıyı giriniz:");
                n2=inp.nextInt();
                int Cıkarma=n1-n2;
                System.out.println("Çıkarma İşleminin Sonucu:"+Cıkarma);
                break;
            case 3:
                System.out.println("Lütfen Birinci Sayıyı Giriniz:");
                n1=inp.nextInt();
                System.out.println("Lütfen İkinci Sayıyı giriniz:");
                n2=inp.nextInt();
                int Carpma=n1*n2;
                System.out.println("Çarpma İşleminin Sonucu:"+Carpma);
                break;
            case 4:
                System.out.println("Lütfen Birinci Sayıyı Giriniz:");
                n1=inp.nextInt();
                System.out.println("Lütfen İkinci Sayıyı giriniz:");
                n2=inp.nextInt();
                if(n2!=0) {
                    int Bolme = n1 / n2;

                    System.out.println("Bölme İşleminin Sonucu:" + Bolme);
                }
                else
                    System.out.println("Bir sayı 0'a Bölünemez Başka Bir işlem deneyin Lütfen ");
                break;

            default:
                System.out.println("Hatalı Giriş yapıldı");
                break;
        }





    }
}
