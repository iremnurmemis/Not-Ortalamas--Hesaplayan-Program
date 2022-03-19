package com.company;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int turkce,mat,fizik,kimya,biyo,total=0,ders=0;
        double ort;
        Scanner inp=new Scanner(System.in);
        System.out.print("turkce notu:");
        turkce=inp.nextInt();
        if(turkce<=0||turkce>=100){
            total+=turkce;
            ders++;
        }
        System.out.print("mat notu:");
        mat=inp.nextInt();
        if(mat<=0||mat>=100){
            total+=mat;
            ders++;
        }
        System.out.print("fizik notu:");
        fizik=inp.nextInt();
        if(fizik<=0||fizik>=100){
            total+=fizik;
            ders++;
        }
        System.out.print("kimya notu:");
        kimya=inp.nextInt();
        if(kimya<=0||kimya>=100){
            total+=kimya;
            ders++;
        }
        System.out.print("biyo notu:");
        biyo=inp.nextInt();
        if(biyo<=0||biyo>=100){
            total+=biyo;
            ders++;
        }
        ort=total/ders;
        if(ort>=55){
            System.out.print("gectiniz");
        }else{
            System.out.print("kaldınız");
        }
    }
}
