/* 	Nama 	: Rizky Dwi Amalia
	Nim 	: 13020180138
	waktu	: 21 april 2020
	tugas 7
*/

//nomor 3
//Program abstract class
public class Manusia extends MakhlukHidup {
    private String duaKaki;
    public Manusia(String duaKaki){
        this.duaKaki = duaKaki;
    }
    public void berdiri (){
        System.out.println("Manusia berdiri menggunakan :  "+duaKaki);
    }
}