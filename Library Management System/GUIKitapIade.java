import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JButton;
public class GUIKitapIade
{
    private JFrame kitapkayıt;
    private Container bilesenKonteyneri; 
    private JPanel p_Panel;
    private JTextField t_Adi,t_OgrenciNo;
    private JLabel     l_Adi,l_OgrenciNo;
    private JButton    button_Kaydet;
    private OlayDinleyicisi olayDinleyici;
    KontrolorKitapIade kontrolor;
    public GUIKitapIade(KontrolorKitapIade k_kontrolor)
    {
        olayDinleyici = new OlayDinleyicisi();
        kontrolor=k_kontrolor;
        pencereHazirla(kitapkayıt);
        panelHazirla   (kitapkayıt); 
        kitapkayıt.setVisible (true); 
    }
    public GUIKitapIade()
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
      button_Kaydet    = new JButton ("Ödünç Ver");
      button_Kaydet.addActionListener(olayDinleyici);
      l_Adi       = new JLabel ("Kitap Adı:"); 
      t_Adi       = new JTextField (10);  
      l_OgrenciNo = new JLabel ("Öğrenci Numarası: "); 
      t_OgrenciNo = new JTextField (10);   
      p_Panel.add(l_Adi);
      p_Panel.add(t_Adi);
      p_Panel.add(l_OgrenciNo);
      p_Panel.add(t_OgrenciNo);
      p_Panel.add(button_Kaydet);
      p_Pencere.add( p_Panel);
    }
    private class OlayDinleyicisi implements ActionListener
    {
       public void actionPerformed  (ActionEvent event)
       {
         if(event.getSource() == button_Kaydet)
          {
              kontrolor.KitapIade(Integer.parseInt(t_OgrenciNo.getText()),t_Adi.getText());
          }
          
        }
    }
}
