public class KontrolorAkademisyenBilgisi extends KontrolorOgrenciBilgisi
{
    private GUIOgrenciBilgisi guiöğrenci;
    private OgrenciModel modelöğrenci;
    public KontrolorAkademisyenBilgisi()
    {
        guiöğrenci=new GUIOgrenciBilgisi(this);
        modelöğrenci=new OgrenciModel();
    }
    protected void UyeBilgileriKayıt(int AkademisyenNo,String AkademisyenAd, String AkademisyenSoyadi)
    {
        modelöğrenci.setöğrenciAd(AkademisyenAd);
        modelöğrenci.setöğrenciSoyad(AkademisyenSoyadi);
        modelöğrenci.setöğrenciNo(AkademisyenNo);
        modelöğrenci.KayıtÖğrenci(AkademisyenAd,AkademisyenSoyadi,AkademisyenNo);
        System.out.println(modelöğrenci.getöğrenciNo()+" numaralı "+modelöğrenci.getöğrenciAd()+" "+modelöğrenci.getöğrenciSoyad()+" isimli akademisyenin kaydı başarıyla yapılmıştır!");
    }
}
