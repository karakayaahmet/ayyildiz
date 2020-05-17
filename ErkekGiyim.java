
package sanalgiyimm;

import java.util.Scanner;

public class ErkekGiyim extends Giyim {
    Scanner klavye = new Scanner(System.in);
    public ErkekGiyim(){
        
    }
    public ErkekGiyim(int gogusOlcusu, int belOlcusu, int basenOlcusu){
        super.getBasenOlcusu();
        super.getBelOlcusu();
        super.getGogusOlcusu();
    }
    
    public ErkekGiyim(String cinsiyet, int gogusOlcusu, int belOlcusu, int basenOlcusu, int sayi) {
        super(cinsiyet, gogusOlcusu, belOlcusu, basenOlcusu);
    }
    
    public void bilgileriGoster(int gogusOlcusu, int belOlcusu, int basenOlcusu) {
   
        System.out.println("*****ERKEK GİYİM*******");
        
        System.out.println("Cinsiyet : ERKEK");
        
        System.out.println("Bel Ölçüsü :"+ belOlcusu);
        
        System.out.println("Basen Ölçüsü :"+ basenOlcusu);
        
        System.out.println("Göğüs Ölçüsü :"+ gogusOlcusu);
        
    }

    public void bedenimiSoyle(int gogusOlcusu, int belOlcusu, int basen){
        if (gogusOlcusu >= 92 && gogusOlcusu < 96 && belOlcusu >= 82 && belOlcusu < 86 && basen >= 90 && basen < 96){
            System.out.println("Bedeniniz : XS");
        }
        
        else if (gogusOlcusu >= 96 && gogusOlcusu < 100 && belOlcusu >= 86 && belOlcusu < 90 && basen >= 96 && basen < 102){
            System.out.println("Bedeniniz : S");
        }
        
        else if (gogusOlcusu >= 100 && gogusOlcusu < 104 && belOlcusu >= 90 && belOlcusu < 94 && basen >= 102 && basen < 108){
            System.out.println("Bedeniniz : M");
        }
        
        else if (gogusOlcusu >= 104 && gogusOlcusu < 110 && belOlcusu >= 94 && belOlcusu < 100 && basen >= 108 && basen < 114){
            System.out.println("Bedeniniz : L");
        }
        
        else if (gogusOlcusu >= 110 && gogusOlcusu < 118 && belOlcusu >= 100 && belOlcusu < 108 && basen >= 114 && basen < 120){
            System.out.println("Bedeniniz : XL");
        }
        
        else if (gogusOlcusu >= 118 && gogusOlcusu < 126 && belOlcusu >= 108 && belOlcusu < 116 && basen >= 120 && basen < 126){
            System.out.println("Bedeniniz : XXL");
        }
        
        else {
            System.out.println("lütfen bedeninizi doğru öğreniniz!!");
        }
    }
    
    public void selamla(){
        System.out.println("HOŞGELDİNİZ..");
    }
    
    public void siparişVer(int adet){
        int sepet = 0;
        if (adet >0){
            System.out.println("beden ölçülerinizi giriniz..");
            while (adet !=0){
                System.out.println("bel ölçünüz :");
                int bel = klavye.nextInt();
                System.out.println("gögüs ölçünüz :");
                int gogus = klavye.nextInt();
                System.out.println("basen ölçünüz :");
                int basen = klavye.nextInt();
                sepet++;
            }
        }
        System.out.println("teşekkürler.. sepetinizde "+sepet+" ürün var. siparişiniz alınmıştır..");
        
    }
    
    public void renkSec(int adet){
        int miktar = 0;
        System.out.println("hoşgeldiniz...");
        System.out.println("renklerinizi sırayla yazınız..");
        if (adet>0){
            System.out.println("renk :");
            String renk = klavye.nextLine();
        }
        System.out.println(miktar+" tane renk seçtiniz..");
    }
    
    public void adreseGonder(){
        System.out.println("Adres bilgilerinizi giriniz...");
        String adres = klavye.nextLine();
        System.out.println("sipariş adresiniz alınmıştır...");
    }
    
    
    
     
}
