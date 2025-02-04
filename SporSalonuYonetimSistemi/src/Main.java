

public class Main {

    public static void main(String[] args) {
        // Singleton: Kayıt Yönetimi

        KayitYonetimi kayitYonetimi = KayitYonetimi.getInstance();

        kayitYonetimi.yeniKayitEkle("Ali");

        kayitYonetimi.yeniKayitEkle("Veli");




        // Factory Method: Ekipman Yönetimi

        IEkipman kosuBand = EkipmanFabrikasi.ekipmanOlustur("KosuBand");

        IEkipman agirlik = EkipmanFabrikasi.ekipmanOlustur("Agirlik");

        kosuBand.kullan();

        agirlik.kullan();

        // Observer: Etkinlik Takibi

        EtkinlikYonetimi etkinlikYonetimi = new EtkinlikYonetimi();

        Uye uye1 = new Uye("Ali");

        Uye uye2 = new Uye("Veli");

        etkinlikYonetimi.gozlemciEkle(uye1);

        etkinlikYonetimi.gozlemciEkle(uye2);

        etkinlikYonetimi.etkinlikYayinla("Yoga dersi bugün saat 18:00'da.");


        // Decorator: Üyelik Tipleri

        IUyelik temelUyelik = new TemelUyelik();

        IUyelik havuzluUyelik = new HavuzErisimi(temelUyelik);

        System.out.println("Üyelik Özellikleri: " + havuzluUyelik.ozellikleriGetir());

        System.out.println("Üyelik Ücreti: " + havuzluUyelik.ucretHesapla() + " TL");





        // Strategy: Ödeme Yönetimi

        IOdemeYontemi krediKarti = new KrediKarti();

        IOdemeYontemi nakit = new Nakit();

        OdemeIslemi odeme1 = new OdemeIslemi(krediKarti);

        odeme1.odemeYap(150.0);

        OdemeIslemi odeme2 = new OdemeIslemi(nakit);

        odeme2.odemeYap(200.0);


    }
}
