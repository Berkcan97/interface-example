package test;


public class MyClass {

	public static void main(String[] args) 
	{
		
		Arac araba = new Otomobil();
		araba.aracCalıstır();
		araba.HızAyarla(100);
		araba.AnlikhizAl(40);
		araba.aracDurdur();
		
		Arac kamyon = new Kamyon();
		
		kamyon.aracCalıstır();
		kamyon.HızAyarla(60);
		kamyon.AnlikhizAl(30);
		kamyon.aracDurdur();
		
		
	
	}

}



