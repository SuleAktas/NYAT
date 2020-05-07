
package nesneyonelimli_odev2;

import java.util.Scanner;

public class TusTakimi implements ITusTakimi
{
     public int veriAl() 
     {
        Scanner input=new Scanner(System.in);
        return input.nextInt();   
     }
}
