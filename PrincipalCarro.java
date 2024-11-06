package avFormativa.desafios;

public class PrincipalCarro {

	public static void main(String[] args) {

		Motor motor = new Motor ("1.3 turbo flex T270 ");

		Carro carro = new Carro ("Jeep Commander", motor);

		System.out.println("Carro é: " + carro.getModelo() + "\nMotor: " + motor.getTipo());

	}
}