import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
public class GUIKitap
{
    private JFrame kitapkayıt;
    private Container bilesenKonteyneri; 
    private JPanel p_Panel;
    private JTextField t_KitapAd,t_KitapNu;
    private JLabel     l_KitapAd,l_KitapNu;
    private JButton    button_Kaydet;
    private OlayDinleyicisi olayDinleyici;
    KontrolorKitap kontrolor;
    public GUIKitap(KontrolorKitap k_kontrolor)
    {
        olayDinleyici = new OlayDinleyicisi();
        kontrolor=k_kontrolor;
        pencereHazirla(kitapkayıt);
        panelHazirla   (kitapkayıt); 
        kitapkayıt.setVisible (true); 
    }
    public GUIKitap()
    {
        olayDinleyici = new OlayDinleyicisi();
        pencereHazirla(kitapkayıt);
        panelHazirla   (kitapkayıt); 
        kitapkayıt.setVisible (true);
    }
    public void pencereHazirla (JFrame p_Pencere )
    {
      kitapkayıt = new JFrame ("Kitap İşlemleri Ekranı");
      kitapkayıt.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
      kitapkayıt.setSize(700, 400);
    }
    public void panelHazirla (JFrame p_Pencere)
    {
      p_Panel     = new JPanel(); 
      button_Kaydet    = new JButton ("KAYDET");
      button_Kaydet.addActionListener(olayDinleyici);
      l_KitapAd       = new JLabel ("Kitap Adı:"); 
      t_KitapAd       = new JTextField (10);
      l_KitapNu    = new JLabel ("Kitap Yazarı:"); 
      t_KitapNu    = new JTextField (10); 
      p_Panel.add(l_KitapAd);
      p_Panel.add(t_KitapAd);
      p_Panel.add(l_KitapNu);
      p_Panel.add(t_KitapNu); 
      p_Panel.add(button_Kaydet);
      p_Pencere.add( p_Panel);
    }
    private class OlayDinleyicisi implements ActionListener
    {
       public void actionPerformed  (ActionEvent event)
       {
         if(event.getSource() == button_Kaydet)
          {
              kontrolor.KitapBilgileriGUIdenAL(Integer.parseInt(t_KitapNu.getText()),t_KitapAd.getText());
          }
          
        }
    }
}
