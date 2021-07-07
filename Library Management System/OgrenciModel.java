
public class OgrenciModel
{
    private String öğrenciAd;
    private String öğrenciSoyad;
    private int öğrenciNo;
    private String [] öğrenci_Ad;
    private String [] öğrenci_Soyad;
    private int [ ] öğrenci_No;
    public OgrenciModel()
    {

    }
    public void KayıtÖğrenci(String ad,String soyad,int No)
    {
        öğrenciAd=ad;
        öğrenciSoyad=soyad;
        öğrenciNo=No;
        öğrenci_Ad=new String[] {öğrenciAd};
        öğrenci_Soyad=new String[] {öğrenciSoyad};
        öğrenci_No=new int [] {öğrenciNo};
    }
    public void  setöğrenciAd (String o_ad ){
      öğrenciAd = o_ad ; 
  }  

  public void  setöğrenciSoyad (String o_soyad ){
      öğrenciSoyad=o_soyad;
  }
  public void  setöğrenciNo (int o_no ){
      öğrenciNo = o_no ; 
  } 
  public String  getöğrenciAd( )  { return öğrenciAd; }
  public String  getöğrenciSoyad( )   { return öğrenciSoyad; }  
  public int  getöğrenciNo( )      { return öğrenciNo; }
}
