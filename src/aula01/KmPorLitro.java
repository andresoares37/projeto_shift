package aula01;

import java.util.Scanner;

public class KmPorLitro {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		float quilometroinicial;
		float litros;
		
		System.out.println("Digite quantos quilometros do inicio da viagem:");
		quilometroinicial = leitor.nextFloat();
		System.out.println("Digite a quilometragem ao final da viagem:");
		float quilometrofinal = leitor.nextFloat();
		System.out.println("Digite quantos litros foram abastecidos:");
		litros = leitor.nextFloat();
		float quilometrosPorLitro = (quilometrofinal - quilometroinicial) / litros;
		leitor.close();
		System.out.print("A quantidade de quilometros por litros é de: " + quilometrosPorLitro);
		

	}

}
