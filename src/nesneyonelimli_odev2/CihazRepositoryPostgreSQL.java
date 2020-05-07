
package nesneyonelimli_odev2;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.Connection;




public class CihazRepositoryPostgreSQL 
{
    private Connection baglan()
    {
        Connection conn=null;
        
        try{
            conn=DriverManager.getConnection("jdbc:postgresql://localhost:5432/NYAT","postgres","sakarya3.");
            if(conn!=null)
                System.out.println("Veritabanına bağlandı.");
            else
                System.out.println("bağlantı girişimi başarısız");
        }catch(Exception e){
            e.printStackTrace();
        }
        return conn;
        
        
    }
    
   public Kullanici ara(int kullaniciid)
   {
       Kullanici kullanici=null;
       
       String sql="SELECT * FROM \"Kullanici\" WHERE \"kullanici_id\"=kullanici_id";
       Connection conn=this.baglan();
       
       try{
           Statement stmt=conn.createStatement();
           ResultSet rs=stmt.executeQuery(sql);
           conn.close();
            
           int kullanici_id;
           int sifre;
           
           while(rs.next())
           {
               kullanici_id=rs.getInt("kullanici_id");
               sifre=rs.getInt("sifre"); 
               kullanici=new Kullanici(kullanici_id,sifre);
              
               
           }
           rs.close();
           stmt.close();
       }catch(Exception e)
       {
           
           e.printStackTrace();
       }
       
       return kullanici;
   }
   
}
