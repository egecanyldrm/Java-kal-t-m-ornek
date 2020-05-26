package javafinalodevi;


class Bilgisayar//Üst sınıf(super class) sınıfımızı oluşturuyoruz böylece alt sınıfları oluşturucak ve özelliklerini miras bırakıcaz
{
    int işlemcinesil,ram,depolamagücü,fiyat; // Bilgisayarın özellikleri olan değişkenlerimizi tanımlıyoruz     
    String üretici;
    public Bilgisayar()//üst sınıfın yapıcısı oluşturuyoruz böylece alt sınıflar hangi class dan miras aldıklarını görebilecekler
    {
        System.out.println("bilgisayar sınıfının yapıcısı");// yapıcı çağrıldığında ekrana hangi sınıfın yapıcısı olduğunu belirticek
    }
    void Attribute(String Maker,int nesil, int bellek , int hafıza, int price)//oluşturucağımız nesnenin özelliklerini isteyecek metod 
    {
        üretici=Maker;
        işlemcinesil=nesil;
        ram=bellek;
        depolamagücü=hafıza;
        fiyat=price;
        System.out.println("bilgiler ekrana kaydedildi");
    }
    
    void ekranBas() // bu metod ise kullanıcıdan aldığımız özellikleri ekrana yazdırıcak 
    {
        System.out.println("Bilgisayarınızın üreticisi:"+üretici+"işlemcinizin nesili"+işlemcinesil+"bilgisayarınızın Ram gücü"+ram+"bilgisayarınızın depolama gücü:"+
                depolamagücü+"Bilgisayarınızın fiyatı: "+fiyat);
        
    }
}
    class Dizustu extends Bilgisayar // Üst sınıft olan  Bilgisayar classından Dizustu classını oluşturuyoruz böylece üst sınıftan miras alıcak
    {
        public Dizustu()// oluşturduğumuz alt sınıfının yapıcısı, ekrana miras aldığı sınıfı yazdırıcak
        {
            System.out.println("dizüstü sınıfının yapıcısı");// yapıcı çağrıldığında ekrana hangi sınıfın yapıcısı olduğunu belirticek
            
        }
    }
    
    class ultrabook extends Bilgisayar // Üst sınıft olan  Bilgisayar classından ultrabook classını oluşturuyoruz böylece üst sınıftan miras alıcak
    {
        public ultrabook()
        {
            System.out.println("ultrabook sınfının yapıcısı");// yapıcı çağrıldığında ekrana hangi sınıfın yapıcısı olduğunu belirticek
        }
    }
    class masaustu extends Bilgisayar // Üst sınıft olan  Bilgisayar classından masaustu classını oluşturuyoruz böylece üst sınıftan miras alıcak
    {
        public masaustu()// oluşturduğumuz alt sınıfının yapıcısı, ekrana miras aldığı sınıfı yazdırıcak
        {
            System.out.println("masaustu sınıfının yapıcısı");// yapıcı çağrıldığında ekrana hangi sınıfın yapıcısı olduğunu belirticek
        }
                
              
    }
    



public class JAVAFİNALODEVİ {


    public static void main(String[] args) 
    {
      masaustu mst=new masaustu(); //masaustu classını kullanarak mst nesnesini oluşturuyoruz
      mst.Attribute("hp", 8, 8, 256, 4000); //oluşturduğumuz nesnenin özelliklerini giriyoruz
      mst.ekranBas();// girdiğimiz özellikleri ekrana bastırıyoruz
    }

}
