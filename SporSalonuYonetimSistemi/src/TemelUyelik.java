public class TemelUyelik implements IUyelik{
    @Override
    public String ozellikleriGetir() {
        return "Temel üyeliktir";
    }

    @Override
    public double ucretHesapla() {
        return 500;
    }
}
