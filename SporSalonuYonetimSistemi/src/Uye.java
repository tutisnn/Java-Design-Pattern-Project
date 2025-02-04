public class Uye implements  IEtkinlikGozlemci{
    private  String ad;
    public Uye(String ad){
        this.ad=ad;
    }
    @Override
    public void bilgilendir(String mesaj) {
        System.out.println(ad + " için mesaj: " + mesaj);

    }
}
