
package nesneyonelimli_odev2;


public class MerkeziBirim implements IMerkeziBirim
{
    
    private SicaklikAlgilayicisi sicaklik_algilayicisi;
    private IEkran ekran=new Ekran();
    public MerkeziBirim()
    {
        sicaklik_algilayicisi=new SicaklikAlgilayicisi();
        
    }
    public void sicaklikGonder()
    {
        sicaklik_algilayicisi.SicaklikOku(ekran);
        //return sicaklik_algilayicisi.getSicaklik();
    }
    public void SogutucuAc()
    {
        IIslem islem=Eyleyici.getInstance();//Singleton tasarım deseni uygulandı.
        islem.sogutucuyuAc();
    }
    public void SogutucuKapa()
    {
        IIslem islem=Eyleyici.getInstance();//Singleton tasarım deseni uygulandı.
        islem.sogutucuyuKapat();
    }
    
    
   
    
}
