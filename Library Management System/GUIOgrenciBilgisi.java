import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
public class GUIOgrenciBilgisi
{
    private JFrame ogrencikayıt;
    private Container bilesenKonteyneri;
    private JPanel p_Panel;
    private JTextField t_Adi,t_Soyadi,t_No;
    private JLabel     l_Adi,l_Soyadi,l_No;
    private JButton    b_Kaydet;
    private OlayDinleyicisi olayDinleyici2;
    KontrolorOgrenciBilgisi kontroloruye;
    public GUIOgrenciBilgisi(KontrolorOgrenciBilgisi k_kontrolor)
    {
        olayDinleyici2 = new OlayDinleyicisi();
        kontroloruye=k_kontrolor;
        pencereHazirla(ogrencikayıt);
        panelHazirla   (ogrencikayıt); 
        ogrencikayıt.setVisible (true); 
    }
    public GUIOgrenciBilgisi()
    {
        olayDinleyici2 = new OlayDinleyicisi();
        pencereHazirla(ogrencikayıt);
        panelHazirla   (ogrencikayıt); 
        ogrencikayıt.setVisible (true); 
    }
    private void pencereHazirla (JFrame p_Pencere )
    {
      ogrencikayıt = new JFrame ("Öğrenci İşlemleri Ekranı");
      ogrencikayıt.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      ogrencikayıt.setSize(700, 400);
    }
           
      
    public void panelHazirla (JFrame p_Pencere)
    {
      p_Panel     = new JPanel(); 
      b_Kaydet    = new JButton ("KAYDET");
      b_Kaydet.addActionListener(olayDinleyici2);
      l_Adi       = new JLabel ("Adı:"); 
      t_Adi       = new JTextField (10);
      l_Soyadi    = new JLabel ("Soyadı:"); 
      t_Soyadi    = new JTextField (10);
      l_No  = new JLabel ("Öğrenci No:"); 
      t_No  = new JTextField (10);     
      p_Panel.add(l_Adi);
      p_Panel.add(t_Adi);
      p_Panel.add(l_Soyadi );
      p_Panel.add(t_Soyadi);
      p_Panel.add(l_No);
      p_Panel.add(t_No);
      p_Panel.add(b_Kaydet);
      p_Pencere.add( p_Panel);
    }
    private class OlayDinleyicisi implements ActionListener
    {
       public void actionPerformed  (ActionEvent event)
       {
         if(event.getSource() == b_Kaydet)
          {
              kontroloruye.UyeBilgileriKayıt(Integer.parseInt(t_No.getText()),t_Adi.getText(),t_Soyadi.getText());
          }
          
        }
    }
    
    
}
