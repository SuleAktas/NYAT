
package nesneyonelimli_odev2;

public class AkilliCihaz 
{
    private IEkran ekran;
    private ITusTakimi tusTakimi;
    
    private static final int SICAKLIK_GORUNTULEME = 1;
    private static final int SOGUTUCU_ACMA = 2;
    private static final int SOGUTUCU_KAPATMA = 3;
    private static final int CIKIS = 4;
    
    public AkilliCihaz()
    {
        ekran=new Ekran();
        tusTakimi=new TusTakimi();
    }
    
    public void basla() 
    {
        
	ekran.mesajGoruntule("Lütfen kullanıcı id girin...");
        int kullanici_id=tusTakimi.veriAl();
                
	ekran.mesajGoruntule("Lütfen şifrenizi girin...");
	int sifre= tusTakimi.veriAl();
        
	IAgArayuzu Ag_Arayuzu=new AgArayuzu();
        
        Ag_Arayuzu.kullaniciDogrula(kullanici_id,sifre);
        
        islemSecimi(Ag_Arayuzu);
    }
    

    private void islemSecimi(IAgArayuzu Ag_Arayuzu){
		int secim;
		 do{
		 	secim=anaMenuyuGoster();
			switch (secim) {
                            
                                case SICAKLIK_GORUNTULEME:

                                       Ag_Arayuzu.SicaklikGosterme();
					break;
                                        
				case SOGUTUCU_ACMA:
                                       Ag_Arayuzu.SogutucuAcIstegi();
					break;
                                        
				case SOGUTUCU_KAPATMA:
                                       Ag_Arayuzu.SogutucuKapamaIstegi();
					break;

				case CIKIS:
					ekran.mesajGoruntule("Çıkılıyor");
					break;
				default:
					ekran.mesajGoruntule("1-4 arasında bir sayı girmelisiniz");
			}
		}while(secim!=4);
	}
    
    private int anaMenuyuGoster()
	{
		ekran.mesajGoruntule("******************************************");
		ekran.mesajGoruntule("Ana Menu");
                ekran.mesajGoruntule("1-Sıcaklık Görüntüleme");
		ekran.mesajGoruntule("2-Soğutucu Açma");
		ekran.mesajGoruntule("3-Soğutucu Kapatma");
		ekran.mesajGoruntule("4-Cikis");
		ekran.mesajGoruntule("Seciminiz:");
		ekran.mesajGoruntule("******************************************");
		return tusTakimi.veriAl();
	}



}
    
    

