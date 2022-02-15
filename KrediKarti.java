
package ja33_nyp_project;



public class KrediKarti {
    private int kartNumarasi;
    private double limit;
    private double guncelBorc;
    private double kullanilabilirLimit;
    
    public KrediKarti(double limit, double guncelBorc){//Parametreli konstrüktörü
        this.limit = limit;
        this.guncelBorc = guncelBorc;
        this.kartNumarasi = (int)(Math.random()*1000000);//Rasgele bir sayı olsun. Integer'e cast ettim çünkü kartNumarasi int tipindedir
        this.kullanilabilirLimit = this.limit+this.guncelBorc;//Kullanılabilir limit limit ile guncelBorcun toplamın sonucudur
    }
    
    public int getKartNumarasi(){//KartNumarası döndürür
        return this.kartNumarasi;
    }
    
    public void setLimit(double yeniLimit){
        this.limit = yeniLimit;
    }
    public double getLimit(){//Limit döndürür
        return this.limit;
    }
    
    public void setGuncelBorc(double guncelBorc){
        this.guncelBorc = guncelBorc;
    }
    public double getGuncelBorc(){//Güncel Borç döndürür
        return this.guncelBorc;
    }
    
    public void setKullanilabilirLimit(double yeniKullanilabilirLimit){
        this.kullanilabilirLimit = yeniKullanilabilirLimit;
    }
    public double getKullanilabilirLimit(){//Kullanılabir limit döndürür
        return this.kullanilabilirLimit;
    }
    
    
    @Override
    public String toString(){//Kartin Bilgileri string olarak verilebilmekte
        return "KartNumarasi: "+this.kartNumarasi+"\nLimit: "+this.limit+"\nGuncelBorc: "+this.guncelBorc+"\nKullanilabilirLimit: "+this.kullanilabilirLimit;
    }
    
    
    
    
    
}
