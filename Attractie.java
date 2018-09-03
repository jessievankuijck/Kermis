package kermis;

public class Attractie {
int attractieNummer;
double attractiePrijs;
String attractieNaam;
void draait(Attractie attractienaam) {
	System.out.println(" draait!");
}
}

class Botsauto extends Attractie {
	int attractieNummer = 1;
	double attractiePrijs = 2.50;
	String attractieNaam = "botsauto";
		
	}
	


class Spin extends Attractie{
	int attractieNummer = 2;
	double attractiePrijs = 2.25;
	Spin() {
		this.attractieNaam = "spin";
	}
}

class Spiegelpaleis extends Attractie{
	int attractieNummer = 3;
	double attractiePrijs = 2.75;
	String attractieNaam;
}
	
class Spookhuis extends Attractie{
	int attractieNummer = 4;
	double attractiePrijs = 3.20;
	String attractieNaam;
}

class Hawaii extends Attractie{
	int attractieNummer = 5;
	double attractiePrijs = 2.90;
	String attractieNaam;
}

class Ladderklimmen extends Attractie{
	int attractieNummer = 6;
	double attractiePrijs = 5.00;
	String attractieNaam;
}


