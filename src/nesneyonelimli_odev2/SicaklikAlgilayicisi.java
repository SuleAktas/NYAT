
package nesneyonelimli_odev2;
import java.util.Random;

public class SicaklikAlgilayicisi implements ISıcaklikAlgilayicisi
{
    private int sicaklik;
    
    public void SicaklikOku(IEkran ekran)
    {
        
        ekran.mesajGoruntule("Sıcaklık ölçülüyor.");
        Random random=new Random();
        sicaklik=random.nextInt(35);
        ekran.mesajGoruntule("Sıcaklık "+sicaklik+" derece...");
        
    }

    
}
