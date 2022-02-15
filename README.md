NESNE YÖNELİK PROGRAMLAMA JAVA PROGRAMLAMA DİLİ İLE
Proje 8 tane sınıftan oluşmaktadır. JA33_NYP_PROJECT adlı sınıfı JFrame ata sınıfından miras alan ve projenin main metodu içeren bir sınıftır. Kisi adlı sınıf BankaPersonli ve 
Musteri adlı sınıfların ata sınıfıdır; yani o iki sınıf Kisi ata sınıfından miras almaktadır. KrediKarti adlı sınıf hiç sınıftan miras almıyor. Son olarak BankaHesabi adlı sınıf 
VadesizHesap ve YatirimHesabi adlı sınıfların ata sınıfıdır.
Projemin sonu olarak JA33_NYP_PROJECT main metodu olan ve JFrame ata sınıfından miras alan sınıfa geçtim. Pencerem için 4 JButton, 7 JTextField ve 6 JLabel tanımladım. 
Ardından gerekli ayarlamalar yaptım kodda gösterdiğim gibi. Pozisyonla ilgili bazı component’ler için pencerenin boyu ve genişliğine bağlı olarak değişsin diye this.getWidth() ve
this.getHeight() kullandım. Sonra  public void actionPerformed(ActionEvent actionEvent) metoduna ActionListener interface'inden override yaptım. Basıldığı butona bağlı olarak 
işlemler gerçekleştirilmektedir.
