package week10;

public class Cellphone implements Phone {
	String merk;
	String type;
	int batteryLevel;
	int status;
	int volume;
	int saldo;
	
	
	public void cekPulsa() {
		System.out.println("saldo anda sekarang adalah: Rp."+saldo);
	}
	
	public void isiPulsa(double jumlahIsi) {
		saldo += jumlahIsi;
		System.out.println("selamat! anda berhasil mengisi saldo sebesar: Rp."+ jumlahIsi);
	}
	
	public Cellphone(String merk, String type)
	{
		this.merk= merk;
		this.type= type;
		this.batteryLevel= (int)(Math.random()*(100-0+1)+0);
	}
	
	public void powerOn(){
        this.status = 1;
        System.out.println("Ponsel menyala");
    }
    
    public void powerOff(){
        this.status = 0;
        System.out.println("Ponsel mati");
        System.out.println("tidak dapat menjalankan apapun!");
    }

    public void volumeUp(){
        if(this.status == 0){
            System.out.println("Ponsel mati. Tidak dapat menaikkan volume");
        }
        else
        {
            this.volume++;
            if(this.volume>=100)
            {
                this.volume = 100;
            }
        }
    }

    public void volumeDown()
    {
        this.volume--;
    }

    public int getVolume()
    {
        return this.volume;
    }

	@Override
	public void isiPulsa() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void tambahContact() {
		// TODO Auto-generated method stub
		
	}

	

}
