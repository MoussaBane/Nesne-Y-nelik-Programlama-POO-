
package ja33_nyp_project;

import java.util.ArrayList;//Bu sınıfın içinde madem listler kullanılacak bu importun edilmesi gerek
public class Musteri extends Kisi{//Musteri,Kisi ata sınıfından miras almaktadır
    
    private int musteriNumarasi;
    private ArrayList<BankaHesabi> hesaplar;
    private ArrayList<KrediKarti> krediKartlari;
    
    
    public Musteri(String ad,String soyad,String email,float telefonNumarasi){
        super(ad,soyad,email,telefonNumarasi);//super() kullanarak ata sınıfın paramatreli konstrüktörü çağrılmış olur
        this.musteriNumarasi = (int)(Math.random()*1000000+1000000.0);/*musteriNumarasi automatik olarak verilmektedir. Madem Math.random() 0 ile 1 arasında rasgele
        sayılar üretir,bu çarpış ve artış yaparak uygun bir sayı bulup integer'e cast edilir*/
        this.hesaplar = new ArrayList<BankaHesabi>();//Hesaplarla yeni bir ArrayList oluşturmaktadır
        this.krediKartlari = new ArrayList<KrediKarti>();//KrediKartlarla yeni bir ArrayList oluşturmaktadır
    }
    
    public int getMusteriNumarasi(){
        return this.musteriNumarasi;
    }
    
    public void hesapEkle(BankaHesabi yeniHesap,double bakiye){//Hesap türüne göre yeni bir hesap oluşturup hasaplar ArrayList'ine eklenir. 
        if(yeniHesap instanceof VadesizHesap){//Eğer VadesizHesap ise
            VadesizHesap hesap = new VadesizHesap(bakiye);
            hesap.setHesapTuru("VadesizHesap");//Hesap neyse türü de öyle olsun
            this.hesaplar.add(hesap);//ArrayList'ine eklenme işlemi
        }
        else {//VadesizHesap değilse YatirimHesap olur
            YatirimHesabi hesap = new YatirimHesabi(bakiye);
            hesap.setHesapTuru("YatirimHesap");
            this.hesaplar.add(hesap);
        }
    }
    
    public void hesapSil(BankaHesabi silinecekHesap){//Silmek istediğimiz hesabin bakiyesine bağlı olarak silinir veya konsola bir uyarı verilmektedir 
        if(silinecekHesap.getBakiye()!=0){
            System.out.println("Lutfen oncelikle bakiyenizi baska bir hesaba aktariniz.");
        }
        else{
            this.hesaplar.remove(silinecekHesap);
        }    
    }
    
    public void krediKartiEkle(KrediKarti krediKarti){//Kredi kart eklemek için
        this.krediKartlari.add(krediKarti);
    }
    
    public void krediKartiSil(KrediKarti silinecekKart){//Silmek istediğimiz krediKartin güncelBorca bağlı olarak silinip veya konsola bir uyarı yazılmaktadır
        if(silinecekKart.getGuncelBorc()!=0){
            System.out.println("Lutfen oncelikle borc odemesi yapiniz.");
        }
        else//0'dan farklı değilse 0'a eşit demektir
            krediKartlari.remove(silinecekKart);
    }
    
    public String getHesaplar(){//Bu metodun sayesinde hesapList'imizi string olarak elimizde olacak
        String str = new String();
        for(BankaHesabi hesap: hesaplar){
            if(hesap instanceof VadesizHesap){
                str += hesap.toString()+"\n";
            }
            else //VadesizHesap değilse YatirimHesap demektir
                str += hesap.toString()+"\n";
        }
        
        return str;//str'nin son hali döndürür
    }
    
    public String getKrediKartlar(){//Hesaplarla yaptığım aynı şey. Burada KrediKartlar için
        String str = new String();
        for(KrediKarti kk : krediKartlari){
            str += kk.toString()+"\n";//Birden fazla karti varsa ilki bittikten sonra alt satıra geçip bir sonrakinin yazsın 
        }
            
        return str;//str'nin son hali döndürür
    }
    
    @Override
    public String toString(){//super anahtar kelimesinin sayesinde ata sınıfın toString() metoduna erişebilmekteyiz
        return super.toString()+"\nMusteri_Numarasi: "+this.musteriNumarasi+"\nHesaplar: "+this.getHesaplar()+"\nKrediKartlar: "+this.getKrediKartlar();
    }
    
}
