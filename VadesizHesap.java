
package ja33_nyp_project;


public class VadesizHesap extends BankaHesabi{//BankaHesabi ata sınıfından miras alan bir sınıftır
    
    private String hesapTuru;
    
    public VadesizHesap(){}//Parametresiz konstrüktörü
    public VadesizHesap(double bakiye){//Parametreli konstrüktörü
        super(bakiye);//Ata sınıfın parametreli kontrüktörü çağrılır
    }
    
    public void setHesapTuru(String hesapTuru){//HesapTuru oluşturur
        this.hesapTuru = hesapTuru;
    }
    public String getHesapTuru(){//HesapTutu döndürür
        return this.hesapTuru;
    }
    
    public void paraTransferi(BankaHesabi aliciHesap,BankaHesabi gonderenHesap,double miktar ){//Paratransferi gerçekleştiren metot
        gonderenHesap.setBakiye(gonderenHesap.getBakiye()-miktar);//gonderenHesabın bakiyesi miktar kadar azalsın
        aliciHesap.setBakiye(aliciHesap.getBakiye()+miktar);//alıcıHesabın bakiyesi miktar kadar yükselsın
    }
    
    public void krediKartiBorcOdeme(KrediKarti krediKarti,double odenecekMiktar){//KrediKartı borç ödeme işlemi gerçekleştiren metot
        krediKarti.setGuncelBorc(krediKarti.getGuncelBorc()-odenecekMiktar);//miktar kadar azalsın
        krediKarti.setKullanilabilirLimit(krediKarti.getKullanilabilirLimit()-odenecekMiktar);//GuncelBorc azalırsa Kullanılabilir limit de azalır demektir
    }
    
    @Override
    public String toString(){//BankaHesabi ata sınıfından override
        return super.toString()+"\nHesapTuru: "+this.hesapTuru;
    }
    
}
