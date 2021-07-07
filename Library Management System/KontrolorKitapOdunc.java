
public class KontrolorKitapOdunc
{
    OduncKitapModel model;
    GUIKitapOdunc gui;
    public KontrolorKitapOdunc()
    {
        model=new OduncKitapModel();
        gui=new GUIKitapOdunc(this);
    }
    public void KitapOdunc(int ogrNo,String Ad)
    {
        model.setKitapAd(Ad);
        model.setogrenciNo(ogrNo);
        model.OduncKayit(ogrNo,Ad);
        System.out.println(Ad+" isimli kitabı "+ogrNo+" üyeye ödünç verildi!");
    }
}
