package aula11.java;

public class Main {

	public static void main(String[] args) {
	Carro carro = new Carro();
	Moto moto = new Moto();


		carro.setPlaca("ABCDD12");
		carro.setCor("preto");
		carro.setModelo("Creta");
		carro.setQtdPortas(4);
		carro.setHorarioEntrada("19:20");
		//ficou estacionado 3 horas
		carro.calcularPreco(3);
		
		moto.setPlaca("FGAG12");
		moto.setCor("Ninja");
		moto.setModelo("Verde");
		moto.setHorarioEntrada("20:00");
		//ficou estacionado 3 horas
		moto.calcularPreco(3);
		
		
	}	
}

