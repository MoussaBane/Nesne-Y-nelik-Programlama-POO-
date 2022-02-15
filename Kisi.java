
package ja33_nyp_project;


public class Kisi {
    
    private String ad;
    private String soyad;
    private String email;
    private float telefonNumarasi;
    
    public Kisi(String ad,String soyad,String email,float telefonNumarasi){//Parametreli Konstrüktörümüz,sırasıyla 3 string ve bir float alınmaktadır
        //Alınan parametreler uygun sınıftaki değişkenine atılır
        this.ad = ad;
        this.soyad = soyad;
        this.email = email;
        this.telefonNumarasi = telefonNumarasi;
    }
    
    /*set metotlar sınıftaki private olan değişkenlerin diğer sınıflardan üzerinde değişiklik yapabilmek içindir
    get metotlar ise diğer sınıflardan bu değişkenlerine erişebilmek içindir*/
    public void setAd(String ad){
        this.ad = ad;
    }
    public String getAd(){//ad döndürüyor
        return this.ad;
    }
    
    public void setSoyad(String soyad){
        this.soyad = soyad;
    }
    public String getSoyad(){//soyad döndürüyor
        return this.soyad;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){//email döndürüyor
        return this.email;
    }
    
    public void setTelefonNumarasi(float telefonNumarasi){
        this.telefonNumarasi = telefonNumarasi;
    }
    public float getTelefonNumarasi(){//telefonNumarası döndürüyor
        return this.telefonNumarasi;
    }
    
    @Override
    public String toString(){//toString() Object ata sınıfından override'dir, String olarak bilgileri döndürüyor
        return "Ad: "+this.ad+"\nSoyad: "+this.soyad+"\nEmail: "+this.email+"\nTelefonNumarasi: "+this.telefonNumarasi;
    }
    
}
