package uts_A11202113733;

public class MahasiswaTransfer extends MahasiswaBaru{
	
	String asalUniversitas;
	
	boolean ikutOspek( ) {
		return false;
	}
	
	void infoMahasiswa( ) {
		int n=5;
		System.out.println("nim mahasiswa : "+super.nim);
		System.out.println("nama mahasiswa : "+super.nama);
		System.out.println("semester : "+super.semester);
		System.out.println("usia mahasiswa : "+super.usia);
		System.out.println("krs mahasiswa : "+super.krs);
		
	}
	
	public static void main(String[] args) {
		Mahasiswa ab= new Mahasiswa();
		ab.infoKrsMahasiswa();
	}

}
