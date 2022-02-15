
package ja33_nyp_project;

import java.util.ArrayList;//Bu sınıfın içinde madem listler kullanılacak bu importun edilmesi gerek
public class BankaPersoneli extends Kisi {//BankaPersoneli,Kisi ata sınıfından miras almaktadır
    
    private int personelID;
    ArrayList<Musteri> musteriler;
    
    public BankaPersoneli(String ad,String soyad,String email,float telefonNumarasi){
        super(ad,soyad,email,telefonNumarasi);//super() kullanarak ata sınıfın paramatreli konstrüktörü çağrılmış olur
        this.personelID = (int)(Math.random()*100000+100000);/*personelID'si automatik olarak verilmektedir. Madem Math.random() 0 ile 1 arasında rasgele
        sayılar üretir,bu çarpış ve artış yaparak uygun bir sayı bulup integer'e cast edilir*/
        this.musteriler = new ArrayList<Musteri>();//Musterilerle bir ArrayList oluşturmaktadır
    }
    
    public int getPersonelID(){//personelID döndürüyor
        return this.personelID;
    }
    
    public void musteriEkle(Musteri musteri){//Parametre olarak geçen musteri bu metoduyla musteriler adlı ArrayList'e eklenecek 
        this.musteriler.add(musteri);
    }
    public void musteriSil(Musteri musteri){//musteriler ArrayList'ten silimek istediğimiz bir musteri varsa bu metoda parametre olarak verip silinmiş olur
        this.musteriler.remove(musteri);
    }
    
    public String musterilerGoster(){//Bu BankaPersoneli tesilci olduğu müşteriler göstermek için kullanılan metodudur
        String musteriler="";
        for(Musteri musteri:this.musteriler){
            musteriler += "Ad: "+musteri.getAd()+"\tSoyad: "+musteri.getSoyad()+"\tEmail: "+musteri.getEmail()+"\n";
            //Boyle yaparak her müşterin bazı verileri(ad,soyad,email) tek satırda olur ve devam edilir
        }
        
        return musteriler;
    }
    
    public String toString(){//Kisi sınıfındaki toString()'ine super anahtar kelimesi kullanarak erişebiliriz  
        return super.toString()+"\nPersonelID: "+this.personelID+"\nMusteriler: "+this.musterilerGoster();
    }
    
    
}
