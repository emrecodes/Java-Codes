
public class KontrolorKitapIade
{
    IadeKitapModel model;
    GUIKitapIade gui;
    public KontrolorKitapIade()
    {
        model=new IadeKitapModel();
        gui=new GUIKitapIade(this);
    }
    public void KitapIade(int ogrNo,String Ad)
    {
        model.setKitapAd(Ad);
        model.setogrenciNo(ogrNo);
        model.IadeKayit(ogrNo,Ad);
        System.out.println(Ad+" isimli kitabı "+ogrNo+" üyeden teslim alındı!");
    }
}
