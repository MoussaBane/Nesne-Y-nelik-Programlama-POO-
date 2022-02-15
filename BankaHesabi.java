
package ja33_nyp_project;


public class BankaHesabi {
    private String iban;//Önünde ülkenin göstergesi olduğu için string olarak tanımladım
    private double bakiye;
    
    public BankaHesabi(){}//Parametresiz konstrüktörü
    public BankaHesabi(double bakiye){//Parametreli konstrüktörü
        this.bakiye = bakiye;
        this.iban = "TR"+(int)(Math.random()*1000000000+10000000);//Rasgele olsun
    }
    
    public String getIban(){//iban döndürür
        return this.iban;
    }
    
    public void setBakiye(double yeniBakiye){
        this.bakiye = yeniBakiye;
    }
    public double getBakiye(){//Bakiye döndürür
        return this.bakiye;
    }
    
    
    @Override
    public String toString(){//Object ata sınıfından override 
        return "Iban: "+this.iban+"\nBakiye: "+this.bakiye;
    }
    
    
    
}
