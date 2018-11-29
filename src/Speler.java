import java.util.Scanner;

public class Speler {
	BordSpel bord = new BordSpel();
	
	static void BeurtRood() {
		
		System.out.println("Kan Rood aangeven in welke kolom hij zijn steen wilt gooien");
			Scanner keuze = new Scanner(System.in);
				keuze.nextLine();
					
	}
	
	static void BeurtGeel() {
		new BordSpel();
		
		System.out.println("Kan Rood aangeven in welke kolom hij zijn steen wilt gooien");
		Scanner scan = new Scanner(System.in);
			String keuze = scan.next();
		
			if (keuze.equalsIgnoreCase("a")) {
				
			}
						
			
			
		
	}
}
