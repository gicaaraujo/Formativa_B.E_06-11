package avFormativa.desafios;

public class Lobo2 extends Animal3{

	public Lobo2(String nome, String sexo, String raca) {
		super(nome, sexo, raca);
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O lobo está uivando");
	}

}
