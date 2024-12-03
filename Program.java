package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");

		int n = sc.nextInt();
		double media = 0;
		double pares = 0;
		Double[] vect = new Double[n];

		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if (vect[i] % 2 == 0) {
				media = media + vect[i];
				pares = pares + 1;
			}
		}
		media = media / pares;
		if(media > 0) {
		System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}else {
			System.out.printf("NENHUM NUMERO PAR");
		}
		sc.close();
	}

}
