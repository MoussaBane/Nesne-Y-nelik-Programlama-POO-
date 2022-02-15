
package ja33_nyp_project;


public class YatirimHesabi extends BankaHesabi {//BankaHesabi ata sınıfından miras alan bir sınıftır
    
    private String hesapTuru;
    
    public YatirimHesabi(){}//Parametresiz konstrüktörü
    public YatirimHesabi(double bakiye){//Parametreli konstrüktörü
        super(bakiye);
    }
    
    public void setHesapTuru(String hesapTuru){
        this.hesapTuru = hesapTuru;
    }
    public String getHesapTuru(){
        return this.hesapTuru;
    }
    
    public void paraEkle(BankaHesabi hesap,double eklenecekMiktar){//Para ekleme işlemi gerçekleştiren metot
        hesap.setBakiye(hesap.getBakiye()+eklenecekMiktar);//miktar kadar bakiyesi yükseltsin
    }
    
    public void paraCek(BankaHesabi hesap,double cekilecekMiktar){//Para çekme işlemi gerçekleştiren metot
        hesap.setBakiye(hesap.getBakiye()-cekilecekMiktar);//bakiyesi miktar kadar azalsın
    }
    
    @Override
    public String toString(){//BankaHesabi ata sınıfından override
        return super.toString()+"\nHesapTuru: "+this.hesapTuru;
    }
    
}
