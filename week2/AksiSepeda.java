package week2;


public class AksiSepeda {

	public static void main(String[] args) {
		//membuat objek
		Sepeda sepedaBalap = new Sepeda(2,"gunung","polygon");
		Sepeda sepedaBayi = new Sepeda (3,"anak-anak","family");
		
		//mengakses atribut dan method
		
		int gearSepeda = sepedaBalap.gear;
		System.out.println(gearSepeda);
		sepedaBalap.ngerem();
	}
}
