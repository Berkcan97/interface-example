package test;

public class Otomobil implements Arac
{
   private int hiz;
   private int anlikhiz;
	@Override
	public void aracCalıstır()
	{
		System.out.println("Araba Calıstı.");
		
	}

	@Override
	public void aracDurdur()
	{
		
		System.out.println("Araba Durdu.");
	}

	@Override
	public void HızAyarla(int hiz)
	{
		this.hiz=hiz;
		System.out.println("Otomobilin Hızı"+" " +hiz+ "Km/s olarak ayarlandı.");
		
	}

	@Override
	public int AnlikhizAl(int anlikhiz)
	{
		this.anlikhiz=anlikhiz;
		System.out.println("Anlık hız"+" "+anlikhiz+"Km/s dir.");
		return anlikhiz;
	}
	
}
