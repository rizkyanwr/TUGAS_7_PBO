/*	Nama 	: Rizky Dwi Amalia
	Nim 	: 13020180138
	waktu	: 21 april 2020
	tugas 7
*/

//nomor 7
//Program inheritance interface
public class Show {
	public static void main (String[] args) {
		Data d = new Data();
		
		d.namaMhs();
		d.stb();
		d.mk();
		
		
		System.out.println("Stambuk = " + d.stb());
		System.out.println("Mata kuliah = " + d.mk());
	}
}