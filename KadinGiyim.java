
package sanalgiyimm;
public class KadinGiyim extends Giyim{
    
    public KadinGiyim(){
        
    }
    
    public KadinGiyim(String cinsiyet, int gogusOlcusu, int belOlcusu, int basenOlcusu) {
        super(cinsiyet, gogusOlcusu, belOlcusu, basenOlcusu);
    }
    
    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        System.out.println("*****KADIN GİYİM*******");
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
}
