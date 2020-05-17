
package sanalgiyimm;
public class Giyim {
     private String cinsiyet;
    private int gogusOlcusu;
    private int belOlcusu;
    private int basenOlcusu;
    
    public Giyim(){
        
    }

    public Giyim(String cinsiyet, int gogusOlcusu, int belOlcusu, int basenOlcusu) {
        this.cinsiyet = cinsiyet;
        this.gogusOlcusu = gogusOlcusu;
        this.belOlcusu = belOlcusu;
        this.basenOlcusu = basenOlcusu;
    }

    
    
    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }

    public int getGogusOlcusu() {
        return gogusOlcusu;
    }

    public void setGogusOlcusu(int gogusOlcusu) {
        this.gogusOlcusu = gogusOlcusu;
    }

    public int getBelOlcusu() {
        return belOlcusu;
    }

    public void setBelOlcusu(int belOlcusu) {
        this.belOlcusu = belOlcusu;
    }

    public int getBasenOlcusu() {
        return basenOlcusu;
    }

    public void setBasenOlcusu(int basenOlcusu) {
        this.basenOlcusu = basenOlcusu;
    }
    
    
    
    public void bilgileriGoster(){
        System.out.println("Cinsiyet :"+cinsiyet);
        System.out.println("Göğüs Ölçüsü :"+gogusOlcusu);
        System.out.println("Bel Ölçüsü :"+belOlcusu);
        System.out.println("Basen :"+basenOlcusu);

    }
    
}
