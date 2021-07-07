public class IadeKitapModel 
{
    private String kitapAd;
    private int ogrenciNo;
    private String [] kitap_Ad;
    private int [ ] ogrenci_No;
  public IadeKitapModel()
  {
        
  }
  public void IadeKayit(int no,String ad)
  {
        kitapAd=ad;
        ogrenciNo=no;
        ogrenci_No=new int[] {ogrenciNo};
        kitap_Ad=new String[] {kitapAd};
  }
  
  public void  setKitapAd (String k_ad ){
      kitapAd = k_ad ; 
  }  
  
  public void  setogrenciNo (int k_ogrencino ){
      ogrenciNo = k_ogrencino;
  }
  public String  getKitapAd( )  { return kitapAd; }
  public int  getogrenciNo( )      { return ogrenciNo; }
}
