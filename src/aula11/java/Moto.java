package aula11.java;

public class Moto extends Veiculo {
	@Override
	public void calcularPreco(int qtdHoras) {
		super.calcularPreco(qtdHoras);
		 int calc = qtdHoras * 10;
		 System.out.println("O valor a pagar e: R$" + calc ); 
		 
	}
	
}
