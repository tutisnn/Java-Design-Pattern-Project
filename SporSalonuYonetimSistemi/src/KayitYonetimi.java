public class KayitYonetimi {
    private static KayitYonetimi instance;
    public  static KayitYonetimi getInstance(){
        if(instance==null) instance=new KayitYonetimi();
        return  instance;
    }
    public void yeniKayitEkle(String uyeAdi){
        System.out.println("Yeni kayıt eklenmiştir: "+uyeAdi);
    }
}
