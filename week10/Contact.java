package week10;

import java.util.Scanner;

public class Contact implements Phone {
	    String nama;
	    String nomor;
	    String tambah[];
	    

	    public void tambahContact()
	    {
	    	
	    	Scanner keyboard = new Scanner(System.in);
	    	int n=4;
	    	String nama;
	    	String nomor;
	    	String tambah[]= new String[4];
	    	System.out.println("Masukkan nama :");
	    	nama= keyboard.nextLine();
	    	System.out.println("Masukkan nomor :");
	    	nomor= keyboard.nextLine();
	    	for(int i=0; i<n; i++) {
	    		tambah[i]= keyboard.nextLine();
	    	}
	    	System.out.println("nama: "+nama);
	    	System.out.println("nomor: "+nomor);
	    	
	    	System.out.println("data contact : ");
			for (int i=0; i<n; i++) {
				System.out.println(tambah[i]);
				
			}
	    }
	   public String lihatContact() {
		  return nama;
		   
	    	
	    	
	    }

	    String getNama()
	    {
	        return this.nama;
	    }

	    int getNomor()
	    {
	        return this.nomor;
	    }

		@Override
		public void powerOn() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void powerOff() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void volumeUp() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void volumeDown() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public int getVolume() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public void cekPulsa() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void isiPulsa() {
			// TODO Auto-generated method stub
			
		}

		public static void main(String[] args) {
			Contact xh= new Contact();
			xh.tambahContact();
			xh.lihatContact();
		}
}
