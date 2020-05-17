
package sanalgiyimm;

import java.util.Scanner;

public class KadinGiyim extends Giyim{
    Scanner klavye = new Scanner(System.in);
    
    public KadinGiyim(){
        
    }
    
    public KadinGiyim(int gogusOlcusu, int belOlcusu, int basenOlcusu){
        super.getBasenOlcusu();
        super.getBelOlcusu();
        super.getGogusOlcusu();
    }
    
    public KadinGiyim(String cinsiyet, int gogusOlcusu, int belOlcusu, int basenOlcusu) {
        super(cinsiyet, gogusOlcusu, belOlcusu, basenOlcusu);
    }
    
    public void bilgileriGoster(int gogusOlcusu, int belOlcusu, int basenOlcusu) {
   
        
        System.out.println("Cinsiyet : KADIN");
        
        System.out.println("Bel Ölçüsü :"+ belOlcusu);
        
        System.out.println("Basen Ölçüsü :"+ basenOlcusu);
        
        System.out.println("Göğüs Ölçüsü :"+ gogusOlcusu);
        
    }

 
    
    public void bedenimiSoyle(int basen, int belOlcusu, int gogusOlcusu){
        if (basen >= 90 && basen < 94 && belOlcusu >= 66 && belOlcusu < 70 && gogusOlcusu >= 82 && gogusOlcusu < 86){
            System.out.println("Bedeniniz : XS");
        }
        else if (basen >= 94 && basen < 98 && belOlcusu >= 70 && belOlcusu < 74 && gogusOlcusu >= 86 && gogusOlcusu < 90){
            System.out.println("Bedeniniz : S");
        }
        else if (basen >= 98 && basen < 102 && belOlcusu >= 74 && belOlcusu < 78 && gogusOlcusu >= 90 && gogusOlcusu < 94){
            System.out.println("Bedeniniz : M");
        }
        else if (basen >= 102 && basen < 107 && belOlcusu >= 78 && belOlcusu < 83 && gogusOlcusu >= 94 && gogusOlcusu < 99){
            System.out.println("Bedeniniz : L");
        }
        else if (basen >= 107 && basen < 112 && belOlcusu >= 83 && belOlcusu < 88 && gogusOlcusu >= 99 && gogusOlcusu < 104){
            System.out.println("Bedeniniz : XL");
        }
        else if (basen >= 112 && basen < 117 && belOlcusu >= 88 && belOlcusu < 93 && gogusOlcusu >= 104 && gogusOlcusu < 109){
            System.out.println("Bedeniniz : XXL");
        }
        else {
            System.out.println("lütfen bedeninizi doğru öğreniniz!!!");
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
