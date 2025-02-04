public class HavuzErisimi extends UyelikDekorator{

    public HavuzErisimi(IUyelik uyelik) {
        super(uyelik);
    }

    @Override
    public String ozellikleriGetir() {
        return "Havuz erişimine sahipsiniz";
    }

    @Override
    public double ucretHesapla() {
        return 1000;
    }
}
