
package nesneyonelimli_odev2;

public class Eyleyici implements IIslem
{
    private static Eyleyici instance;
    private IEkran ekran;
    private Eyleyici()
    {
        ekran=new Ekran();
    }
    public static synchronized Eyleyici getInstance()
    {
        if(instance==null)
            instance=new Eyleyici();
        return instance;
    }
    
    
    public void sogutucuyuAc()
    {
        
        ekran.mesajGoruntule("Soğutucu açıldı...");
        
    }
    public void sogutucuyuKapat()
    {
        ekran.mesajGoruntule("Soğutucu kapatıldı...");
        
    }
   
    
    
}
