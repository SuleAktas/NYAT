
package nesneyonelimli_odev2;


public class Kullanici 
{
    private int kullanici_id;
    private int sifre;
    
    public Kullanici(int kullanici_id,int sifre) 
    {
        this.kullanici_id =kullanici_id;
        this.sifre=sifre;
    }
    public Kullanici()
    {
        
    }
    
    public int getId() 
    {
        return kullanici_id;
    }

    public void setId(int kullanici_id)
    {
        this.kullanici_id = kullanici_id;
    }
    public int getsifre() 
    {
        return sifre;
    }

    public void setsifre(int sifre) 
    {
        this.sifre = sifre;
    }
}
