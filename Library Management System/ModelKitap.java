public class ModelKitap 
{
    private String KitapAd;
    private String KitapNu;
    private String [] kitap_Ad;
    private String [ ] kitap_nu;

    public ModelKitap()
    {
        
    }
  public void KitapBilgileriniGuncelle(String ad, String nu)
  {
        KitapAd=ad;
        KitapNu=nu;
        kitap_Ad=new String[] {KitapAd};
        kitap_nu=new String[] {KitapNu};  
  }
  public void  setKitapNo (String p_kitapNo ){
       KitapNu= p_kitapNo;
  }  

  public void  setKitapAdi (String p_kitapAdi ){
      KitapAd = p_kitapAdi ;
      kitap_Ad=new String[]{p_kitapAdi};
  } 

  public String  getKitapAd( ) 
  { 
      return KitapAd;
  }
  public String  getKitapNu( )   
  { 
      return KitapNu; 
  }  
  
}
