package test;

public class Kamyon implements Arac
{
  private int hiz;
  private int anlikhiz;
	@Override
	public void aracCalıstır()
	{
		
		System.out.println("Kamyon Calıstı.");
	}

	@Override
	public void aracDurdur()
	{
		
		System.out.println("Kamyon Durdu.");
	}

	@Override
	public void HızAyarla(int hiz)
	{
		this.hiz=hiz;
		System.out.println("Kamyon hızı"+" "+hiz+ "Km/s olarak belirlendi.");
		
	}

	

	@Override
	public int AnlikhizAl(int anlikhiz) {
		
		this.anlikhiz=anlikhiz;
		System.out.println("Anlık hız"+" "+anlikhiz+"Km/s dir.");
		return anlikhiz;
	}

}
