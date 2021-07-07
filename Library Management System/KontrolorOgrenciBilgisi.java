
public class KontrolorOgrenciBilgisi
{
    private GUIOgrenciBilgisi guiöğrenci;
    private OgrenciModel modelöğrenci;
    public KontrolorOgrenciBilgisi()
    {
        guiöğrenci=new GUIOgrenciBilgisi(this);
        modelöğrenci=new OgrenciModel();
    }
    protected void UyeBilgileriKayıt(int ÖğrenciNo,String ÖğrenciAd, String ÖğrenciSoyadi)
    {
        modelöğrenci.setöğrenciAd(ÖğrenciAd);
        modelöğrenci.setöğrenciSoyad(ÖğrenciSoyadi);
        modelöğrenci.setöğrenciNo(ÖğrenciNo);
        modelöğrenci.KayıtÖğrenci(ÖğrenciAd,ÖğrenciSoyadi,ÖğrenciNo);
        System.out.println(modelöğrenci.getöğrenciNo()+" numaralı "+modelöğrenci.getöğrenciAd()+" "+modelöğrenci.getöğrenciSoyad()+" isimli öğrencinin kaydı başarıyla yapılmıştır!");
    }
    
}
