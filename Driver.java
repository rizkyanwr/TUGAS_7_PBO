/*	Nama 	: Rizky Dwi Amalia
	Nim 	: 13020180138
	waktu	: 21 april 2020
	tugas 7
*/

//nomor 6
//Program menggabungkan antar abstract class dan interface
public class Driver {
 public static void main (String[] args){
  Kucing k = new Kucing("Kucing",4,"Meong meong", "Coklat");
  k.displayData();
  System.out.println();
    Sapi b = new Sapi("Sapi",4,"Moooo", "Putih corak Hitam");
  b.displayData();
  System.out.println();
  
 }
}