import java.util.Arrays;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[10];
		int i;

		Scanner ler = new Scanner(System.in);

		System.out.println("Digite 10 números:");

		for (i = 0; i < numeros.length; i++) {

			numeros[i] = ler.nextInt();
		}

		Arrays.sort(numeros);
		
		i = 0;

		for(i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
