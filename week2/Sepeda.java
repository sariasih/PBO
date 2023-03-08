package week2;

public class Sepeda {
	int gear=5;
	int jumlahroda;
	String jenis;
	String merk;

	
	void ngerem() {
		System.out.println("sepeda direm!");
	}
	
	Sepeda(int jumlahroda, String jenis, String merk){
		System.out.println("sepeda "+jenis+" bermerk "+merk+" memiliki jumlah roda "+jumlahroda);
	}
	
	public static void main(String[] args) {
		Sepeda sepedaBalap = new Sepeda(2,"gunung","polygon");
		Sepeda sepedaBayi = new Sepeda (3,"anak-anak","family");
		
		int gearSepeda = sepedaBalap.gear;
		System.out.println("jumlah gear "+gearSepeda);
		
		sepedaBalap.ngerem();
		
	}

}
