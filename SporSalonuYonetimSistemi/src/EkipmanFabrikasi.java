public class EkipmanFabrikasi {
    public static  IEkipman  ekipmanOlustur(String tip){
        if(tip=="KosuBand"){
            return new KosuBand();
        }else if(tip=="Agirlik"){
            return  new Agirlik();
        }else{
            System.out.println("Geçersiz bir tip girdiniz.");
            return null;
        }
    }
}
