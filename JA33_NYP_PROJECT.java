
package ja33_nyp_project;

//Pencere kullanmak için import gereken importlar
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JA33_NYP_PROJECT extends JFrame implements ActionListener{//JFrame sınıfdan miras alınır ve ActionListener interface'inden implement eden sınıf
    
    private JButton jbt1,jbt2,jbt3,jbt4;//4 buton
    private JTextField jtf1,jtf2,jtf3,jtf4,jtf5,jtf6,jtf7;//7 text kutusu
    private JLabel jl1,jl2,jl3,jl4,jl5,jl6;//6 etiket
    
    //actionPerformed() metodunda bu değişkenleri kolayca kullanabilmek için buraya koydum
    Musteri musteri;
    KrediKarti krediKarti;
    BankaHesabi yeniHesap;
    
    
    public JA33_NYP_PROJECT(String title){//Parametreli konstrüktörü
        this.setTitle(title);//Pencerenin başlığı ayarlanır
        this.setSize(800,620);//Pencerenin boyu ve genişliği ayarlanır
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Pencerenin sağ köşesindeki kırmızı tuşuna basarak pencereyı kapatıp program sonlandırılır
        this.setLocationRelativeTo(null);//Penceremiz ekranımızın oratasında olsun diye
        this.setLayout(null);//Penceremizdeki elemenları iyi görüntülebilmek için
        
        /*Komponentlerin tanımlamaları ve ayarları*/
        //Etiketler
        jl1 = new JLabel("Adi: ");
        jl1.setBounds((int)(this.getWidth()/2)-150,30,150,30);
        this.add(jl1);
        jl2 = new JLabel("Soyadi: ");
        jl2.setBounds((int)(this.getWidth()/2)-150,60,150,30);
        this.add(jl2);
        jl3 = new JLabel("Mail Adresi: ");
        jl3.setBounds((int)(this.getWidth()/2)-150,90,150,30);
        this.add(jl3);
        jl4 = new JLabel("Tel No: ");
        jl4.setBounds((int)(this.getWidth()/2)-150,120,150,30);
        this.add(jl4);
        jl5 = new JLabel("Adiniz Soyadiniz: ");
        jl5.setBounds((int)(this.getWidth()/2)-150,150,150,30);
        this.add(jl5);
        jl6 = new JLabel("Ogrenci Numaraniz: ");
        jl6.setBounds((int)(this.getWidth()/2)-150,180,150,30);
        this.add(jl6);
        
        //Text kutular
        jtf1 = new JTextField();
        jtf1.setBounds((int)(this.getWidth()/2)+20,30,150,30);
        this.add(jtf1);
        jtf2 = new JTextField();
        jtf2.setBounds((int)(this.getWidth()/2)+20,60,150,30);
        this.add(jtf2);
        jtf3 = new JTextField();
        jtf3.setBounds((int)(this.getWidth()/2)+20,90,150,30);
        this.add(jtf3);
        jtf4 = new JTextField();
        jtf4.setBounds((int)(this.getWidth()/2)+20,120,150,30);
        this.add(jtf4);
        jtf5 = new JTextField();
        jtf5.setBounds((int)(this.getWidth()/2)+20,150,150,30);
        jtf5.setText("MOUSSA  BANE");
        this.add(jtf5);
        jtf6 = new JTextField();
        jtf6.setBounds((int)(this.getWidth()/2)+20,180,150,30);
        jtf6.setText("20360859102");
        this.add(jtf6);
        jtf7 = new JTextField();
        jtf7.setBounds((int)(this.getWidth()/4),(int)(this.getHeight()/2)+50,(int)(this.getWidth()/2),(int)(this.getHeight()/4));
        this.add(jtf7);
        
        //Butonlar
        jbt1 = new JButton("Musteri Ekle");
        jbt1.setBounds((int)(this.getWidth()/2)-200,250,150,40);
        jbt1.addActionListener(this);
        this.add(jbt1);
        
        jbt2 = new JButton("Musteri Bilgileri");
        jbt2.setBounds((int)(this.getWidth()/2)+50,250,150,40);
        jbt2.addActionListener(this);
        this.add(jbt2);
        
        jbt3 = new JButton("Hesap Bilgileri");
        jbt3.setBounds((int)(this.getWidth()/2)-200,300,150,40);
        jbt3.addActionListener(this);
        this.add(jbt3);
        
        jbt4 = new JButton("Kredi Bilgileri");
        jbt4.setBounds((int)(this.getWidth()/2)+50,300,150,40);
        jbt4.addActionListener(this);
        this.add(jbt4);
        
        
        
        this.setVisible(true);//Perceremizin görünebilmesi için
    }
    
    @Override
    public void actionPerformed(ActionEvent actionEvent){//ActionListener interface'inden override
        //Text kutularındaki textleri tutan deşikenleri tanımlanır
        String ad = jtf1.getText();
        String soyad = jtf2.getText();
        String email = jtf3.getText();
        float telefonNo = Float.valueOf(jtf4.getText());//Bu alandaki texi yani string'i alıp float'a cast edilir
        
        
        
        if(actionEvent.getSource().equals(jbt1)){//Musteri Ekle butona basıldığında gerçekleştirmek gereken işlemler
            this.musteri = new Musteri(ad,soyad,email,telefonNo);
            this.yeniHesap = new VadesizHesap();
            this.musteri.hesapEkle(this.yeniHesap,102563504.0);
            this.krediKarti = new KrediKarti(2536892.0,845.75);
            this.musteri.krediKartiEkle(this.krediKarti);
        }
        else if(actionEvent.getSource().equals(jbt2)){//Musteri Bilgileri tuşuna basıldığında
            jtf7.setText(this.musteri.toString());
        }
        else if(actionEvent.getSource().equals(jbt3)){//Hesap Bilgileri tuşuna basıldığında
            jtf7.setText(this.musteri.getHesaplar());
        }
        else if(actionEvent.getSource().equals(jbt4)){//Kredi Bilgileri tuşuna basıldığında
            jtf7.setText(this.krediKarti.toString());
        }
    }

   
    public static void main(String[] args) {
        //Penceremizin tipinde yeni bir nesne tanımlanır
        JA33_NYP_PROJECT Pencere = new JA33_NYP_PROJECT("Nesneye Yonelik Programlama Projesi");
        
    }
    
}
