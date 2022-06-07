package jana60;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		float prezzokm = 0.21F;
		int km;
		int ageUser;
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Inserisci distanza [km]:");
		km= scan.nextInt();
		
		float prezzobigl = prezzokm * km;
		
		System.out.println("Prezzo biglietto non scontato" + " = " + prezzobigl);
		
		System.out.println("Inserisci età: " );
		ageUser = scan.nextInt();
		
		float scontou18 = prezzobigl / 100 * 80;
		float scontoo65 = prezzobigl / 100 * 60;
		
		if (ageUser < 18){
			System.out.println("Prezzo biglietto scontato" + " = " + scontou18);
		} 
		else if (ageUser > 65) {
			System.out.println("Prezzo biglietto scontato" + " = " + scontoo65);
		}
		else {
			System.out.println("Prezzo biglietto finale" + " = " + prezzobigl);
		}
		
		scan.close();
	}
	
}
