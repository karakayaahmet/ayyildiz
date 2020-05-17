
package sanalgiyimm;
public class ErkekGiyim extends Giyim {
    
    public ErkekGiyim(){
        
    }
    
    public ErkekGiyim(String cinsiyet, int gogusOlcusu, int belOlcusu, int basenOlcusu) {
        super(cinsiyet, gogusOlcusu, belOlcusu, basenOlcusu);
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("*****ERKEK GİYİM*******");
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
}
