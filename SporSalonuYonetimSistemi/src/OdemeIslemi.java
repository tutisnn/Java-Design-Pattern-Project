public class OdemeIslemi {
    private IOdemeYontemi odemeYontemi;
    public OdemeIslemi(IOdemeYontemi odemeYontemi){
        this.odemeYontemi=odemeYontemi;
    }
    public void odemeYap(double miktar){
    odemeYontemi.odemeYap(miktar);
    }
}
