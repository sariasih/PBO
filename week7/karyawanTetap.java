package week7;

public class karyawanTetap extends Karyawan {
	
	int gajiPokok;
	int tunjanganAnak;
	
	void totalGaji(int gajiPokok, int tunjanganAnak) {
		System.out.println("gaji pokok= "+ gajiPokok);
		System.out.println("tunjangan anak= "+ tunjanganAnak);
		System.out.println("total gaji= "+(gajiPokok+tunjanganAnak));
		
	}
	
	public static void main(String[] args) {
	karyawanTetap mx= new karyawanTetap();
	mx.totalGaji(2000,200);
	
	}
}
