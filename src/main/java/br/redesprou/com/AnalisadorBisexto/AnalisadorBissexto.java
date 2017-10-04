package br.redesprou.com.AnalisadorBisexto;

public class AnalisadorBissexto {

	public boolean ehBissexto(int numero ) {
		boolean resultado = false;
		
			if( numero != 0 ) {
			
			if((numero % 400 == 0 ) || (numero % 4 == 0 && numero % 100 != 0 )){
				resultado = true;
			}
		}
			return resultado;

	}
	
}
