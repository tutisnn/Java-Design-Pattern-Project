public abstract class UyelikDekorator implements  IUyelik {
    protected  IUyelik uyelik;
    public  UyelikDekorator(IUyelik uyelik){
        this.uyelik=uyelik;
    }


}
