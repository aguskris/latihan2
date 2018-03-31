package latihan2;

public class retengelAksi {
   public static void main(String[] args){
       retengel r1 = new retengel();
       r1.panjang = 8;
       r1.rendah = 6;
       
       r1.cetakInfo();
       System.out.println("rendah retengel = "+r1.hitungjarak());
       r1.cetakjarak();
   
       retengel r2= new retengel();
       r2.cetakInfo();
       
       retengel r3= new retengel(50,30);
       r3.cetakInfo();
   } 
}
