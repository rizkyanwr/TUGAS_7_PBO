/* 	Nama 	: Rizky Dwi Amalia
	Nim 	: 13020180138
	waktu	: 21 april 2020
	tugas 7
*/

//nomor 7
//Program inheritance interface
public class Data implements MataKuliah{

	@Override
	public void namaMhs() {
		System.out.println("Nama Mahasiswa = Rizky Dwi Amalia .");
		
	}

	@Override
	public String stb() {
		return "13020180138";
	}
	
	@Override
	public String mk() {
		return "Pemrograman Berorientasi Objek";
	}
	
}