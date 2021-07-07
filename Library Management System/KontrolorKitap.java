
public class KontrolorKitap
{
    private GUIKitap g_GUIKitap;
    private ModelKitap m_ModelKitap;
    public KontrolorKitap()
    {
        g_GUIKitap=new GUIKitap(this);
        m_ModelKitap=new ModelKitap();
    }
    public void KitapBilgileriGUIdenAL(String p_KNo, String p_KAdi)
    {
        m_ModelKitap.setKitapAdi(p_KAdi);
        m_ModelKitap.setKitapNo(p_KNo);
        m_ModelKitap.KitapBilgileriniGuncelle(p_KAdi,p_KNo);
        System.out.println(m_ModelKitap.getKitapAd()+" kitabı başarıyla guncellendi!");
    }
}
