package kermis;
import java.util.Scanner;


public class Kermis {
	public static void main(String[] args) {
		System.out.println("Welkom op de kermis, druk op een nummer tussen 0 t/m 6 om een attractie te laten draaien!");
		Attractie botsauto = new Botsauto(); 
		Attractie spin = new Spin();
		Attractie spiegelpaleis  = new Spiegelpaleis();
		Attractie spookhuis = new Spookhuis();
		Attractie hawaii = new Hawaii();
		Attractie ladderklimmen = new Ladderklimmen();
		char input1;
		
		Scanner scanner1 = new Scanner(System.in);
		boolean validinput=false;
		while(validinput == false) {
			String input = scanner1.nextLine();
			if( (input.length() != 1)) { //als de input niet slechts 1 teken bevat, krijg je een melding
				System.out.println("Je input wordt niet herkend! Toets 1, 2, 3, 4, 5 of 6 in");
			}else {
				validinput = true;
				input1 = input.charAt(0);// maakt van de input een char en gaat vervolgens naar de switch
				switch (input1) {
					case '1':  System.out.println("De botsauto's "); 
					botsauto.draait(botsauto);
					break;
					
					case '2':	System.out.println("De Spin ");
					spin.draait(spin);
					break;
					
					case '3':	System.out.println("Het Spiegelpaleis ");
					spiegelpaleis.draait(spiegelpaleis);
					break;
					
					case '4':	System.out.println("Het Spookhuis ");
					spookhuis.draait(spookhuis);
					break;
					
					case '5':	System.out.println("Hawaii");
					hawaii.draait(hawaii);
					break;
					
					case '6':	System.out.println("Ladderklimmen");
					ladderklimmen.draait(ladderklimmen);
					break;
				}
			}

		}
		
		
			
		
		
		//if(input.equals("1"))
		//System.out.println(spin.attractieNaam + "draait");
	}
}
