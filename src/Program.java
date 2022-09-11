import java.util.Locale;
import java.util.Scanner;


public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner tc = new Scanner(System.in);
		
		System.out.println("Digite 4 palavras: ");
		String[] palavras = tc.nextLine().split(" ");
		
		for (int i = 0; i < 4; i++) {
			System.out.println(palavras[i]);
		}
		
		tc.close();
	}

}
