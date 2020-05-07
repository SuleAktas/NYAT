
package nesneyonelimli_odev2;


public class AgArayuzu implements IAgArayuzu 
{
    
    private IMerkeziBirim merkezi_birim=new MerkeziBirim();
    private IEkran ekran =new Ekran();
    CihazRepositoryPostgreSQL deneme=new CihazRepositoryPostgreSQL();
    public void kullaniciDogrula(int kullanici_id, int sifre) 
    {
        Kullanici kullanici;
        kullanici=deneme.ara(kullanici_id);
        ekran.mesajGoruntule("Merkezi işlem birimi kullanıcıyı doğruluyor...");
       // int sayac=0;
//        do{
//            
//            if(kullanici_id==kullanici.getId())
//            {
//                if(sifre==kullanici.getsifre())
//                {
//                    ekran.mesajGoruntule("Hoşgeldiniz...");
//                }
//                else
//                {
//                    ekran.mesajGoruntule("Yanlış şifre...");
//                }
//            }
//            else
//            {
//                 ekran.mesajGoruntule("Kullanici id yanlış...");
//                 sayac++;
//            }
            
         
       // }while(sayac<3);
        
        
    }
    public void SicaklikGosterme()
    {
        
        merkezi_birim.sicaklikGonder();
    }
    public void SogutucuAcIstegi()
    {
        merkezi_birim.SogutucuAc();
        
    }
    public void SogutucuKapamaIstegi()
    {
        merkezi_birim.SogutucuKapa();
    }
}
