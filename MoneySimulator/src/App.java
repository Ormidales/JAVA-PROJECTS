import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		// DÉBUT DU JEU - ON NOUS DEMANDE LE NOM DE NOTRE ENTREPRISE
		MoneySimulation simulation = new MoneySimulation();
		System.out.println("--------------------------------------------------------------");
		System.out.println("Bienvenue dans MoneySimulation !");
		System.out.println("Entrer le nom de votre entreprise :");
		System.out.println("--------------------------------------------------------------");
		Scanner scanner = new Scanner(System.in);
		String nameCompany = scanner.nextLine();
		simulation.renameCompany(nameCompany);
		System.out.println("--------------------------------------------------------------");
		System.out.println("Votre entreprise s'appelle : " + simulation.getCompanyName());
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		
		// VOTRE ENTREPRISE A REALISER SES PREMIER BENEFICES
		System.out.println("--------------------------------------------------------------");
		System.out.println("Votre solde de départ est de : " + simulation.getMoney() + "€");
		System.out.println("--------------------------------------------------------------");
		simulation.earnMoney(500);
		System.out.println("Vous avez gagner vos premier 500€");
		System.out.println("Votre solde est de : " + simulation.getMoney() + "€");
		System.out.println("--------------------------------------------------------------");
		simulation.payTaxes();
		System.out.println("Vous avez payer vos taxes :(");
		System.out.println("Votre solde est de : " + simulation.getMoney() + "€");
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		
		// ON REGARDE LES DATES
		System.out.println("--------------------------------------------------------------");
		System.out.println("Aujourd'hui nous sommes le " + simulation.getDay() + "/" + simulation.getMonth() + "/" + simulation.getYear());
		System.out.println("--------------------------------------------------------------");
		simulation.setDay(5);
		simulation.setMonth(5);
		simulation.setYear(2022);
		System.out.println("Aujourd'hui nous sommes le " + simulation.getDay() + "/" + simulation.getMonth() + "/" + simulation.getYear());
		System.out.println("--------------------------------------------------------------");
		simulation.setDay(30);
	    simulation.setMonth(12);
	    simulation.setYear(1999);
	    simulation.incrementDay();
		System.out.println("Aujourd'hui nous sommes le " + simulation.getDay() + "/" + simulation.getMonth() + "/" + simulation.getYear());
		System.out.println("--------------------------------------------------------------");
		System.out.println("");
		System.out.println("");
		
		// ON CREER UN JEU
		System.out.println("--------------------------------------------------------------");
		Game jeu1 = new Game("Minecraft", 17, 4, 2011, 7);
		System.out.println("Le jeu " + jeu1.getName() + " est sortie le " + jeu1.getDay() + "/" + jeu1.getMonth() + "/" + jeu1.getYear() + " et coûte " + jeu1.getPrice() + "€");
		System.out.println("--------------------------------------------------------------");
		
		
		
	}

}
