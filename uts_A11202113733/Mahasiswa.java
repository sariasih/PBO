package uts_A11202113733;

import java.util.Scanner;

public class Mahasiswa {
	
	private static final String[][] String = null;
	String nim;
	String nama;
	int semester;
	int usia;
	String krs[];
	
	
	float hitungRataNilai() {
		Scanner baru = new Scanner (System.in);
		int n=5;
		int nilai1[];
		int nilai11[]= new int[5];
		System.out.println( "Masukkan elemen array: " );  
		for ( int  i= 0 ; i<n; i++)  
		{     
		nilai11[i]=baru.nextInt(); 
		
	}
		System.out.println("rata-rata nilai ="+(nilai11[0]+nilai11[1]+nilai11[2]+nilai11[3]+nilai11[4]));
		
		return 0;
		
	}
	
	void infoMahasiswa() {
		
		String nama1;
		String nim1;
		int semester1;
		int usia1;
		String krs[];
		int n = 5;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Data Mahasiswa Universitas XYZ");
		System.out.println("Nama mahasiswa : ");
		nama1 = keyboard.nextLine();
		System.out.println("nim : ");
		nim1 = keyboard.nextLine();
		System.out.println("semester : ");
		semester1 = keyboard.nextInt();
		System.out.println("usia : ");
		usia1 = keyboard.nextInt(); 
		String krs11 [] =  new String [5];   
		System.out.println( "Masukkan elemen array: " );  
		for ( int  i= 0 ; i<n; i++)  
		{     
		krs11[i]=keyboard.nextLine(); 
		
	}
		
		System.out.println("nim mahasiswa : "+nim);
		System.out.println("nama mahasiswa : "+nama);
		System.out.println("semester : "+semester);
		System.out.println("usia mahasiswa : "+usia);
		System.out.println("krs mahasiswa : ");
		for (int i=0; i<n; i++) {
			System.out.println(krs11[i]);
			
		}
			
		}
		
		
	
	
	void infoKrsMahasiswa( ) {
		
		Scanner tab= new Scanner(System.in);
		
		int n=5;
		
		String krs2 [] =  new String [5];   
		System.out.println( "Masukkan elemen array: " );  
		for ( int  i= 0 ; i<n; i++)  
		{     
		krs2[i]=tab.nextLine(); 
		}
		System.out.println("krs mahasiswanya adalah : ");
		for (int i=0; i<n; i++) {
			System.out.println(krs2[i]);
			
		}
	}
	
	public static void main(String[] args) {
	
		Mahasiswa mx= new Mahasiswa();
		//mx.infoMahasiswa();
		//mx.infoKrsMahasiswa();
		mx.hitungRataNilai();
		

	

}
}
