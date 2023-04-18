package week7;

public class karyawanKontrak extends Karyawan {
	int upahHarian;
	int hariMasuk;
	int tunjanganAnak;
	
	void totalUpah(int upahHarian,int hariMasuk,int tunjanganAnak) {
		System.out.println("upah harian= "+ upahHarian);
		System.out.println("hari masuk = "+ hariMasuk);
		System.out.println("tunjangan anak = "+ tunjanganAnak);
		System.out.println("total upah = "+ (upahHarian * hariMasuk + tunjanganAnak));
	}
	
	public static void main(String[] args) {
		karyawanKontrak mx= new karyawanKontrak();
		mx.totalUpah(200,2,30);
		
	}

}
