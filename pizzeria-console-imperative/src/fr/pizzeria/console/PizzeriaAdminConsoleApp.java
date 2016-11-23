package fr.pizzeria.console;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		
		//tableau de pizzas
		Object[][] carte= {{"PEP","Peperoni",12.50},
				{"MAR","Margherita",14.00},
				{"REI","Reine",11.50},
				{"FRO","4 fromages",12.00},
				{"CAN","Cannibale",12.50},
				{"SAV","Savoyarde",13.00},
				{"ORI","Orientale",13.50},
				{"IND","Indienne",14.00}};
				
		int choix=0,parc;
		String tap;
		boolean go=true;
		while(go)
		{
			System.out.print("*****Pizzeria Administration*****\n "
				+ "1. Lister les pizzas\n"
				+ "2. Ajouter une nouvelle pizza\n "
				+ "3. Mettre à jour une pizza\n"
				+ "4. Supprimer une pizza\n"
				+ "99. Sortir2\n");
			
			Scanner s = new Scanner(System.in);
			choix = s.nextInt();
			int n = carte.length;
			switch(choix){
			case(1) : System.out.println("Vous avez choisi de lister les pizzas");
				
				parc=0;
				while(parc<n){
					Object[]t=carte[parc];
					System.out.println(t[0]+" -> "+t[1]+"("+t[2]+"€)");
					parc++;
				}
				break;
				
			case(2) : System.out.println("vous avez choisi d'ajouter une pizza!");
				/*Object[]t={"VEG","Végétarienne",10.00};
				Object[] newtab=Arrays.copyOf(carte, n+1);
				newtab[n][0]="VEG";
				System.out.println(newtab[0].toString()+" -> "+newtab[1]+"("+newtab[2]+"€)");
				break;
				*/
	///Geoffrey		
			// Menu Ajout Carte	
			int k;			
			Object carteC[][] = new Object[n+1][3];
			float l;
			// Réécriture Carte pizza
			
			for (parc=0; parc<n;parc++) {		
				for (k=0; k<3 ; k++) {					
					carteC[parc][k]=carte[parc][k];					
				}						
			}
			
			// Enregistrement nouvelle entrée
			
			System.out.print("Veuillez saisir le code: ");			
			tap = s.next();
			carteC[n][0] = tap;
			
			System.out.print("Veuillez saisir le nom (sans espace): ");
			tap = s.next();
			carteC[n][1] = tap;
			
			System.out.print("Veuillez saisir le prix: ");
			l = s.nextFloat();
			
			carteC[n][2] = l;		
			carte = carteC;
			
			break;
			
			case(3) : System.out.println("vous avez choisi de mettre à jour une pizza!");
			
			
		// Menu Modification Carte
			
//Affichage
			for (parc=0; parc<n; parc++){
				System.out.println(carte[parc][0] + "-> " + carte[parc][1] + " (" + carte[parc][2] + "€)" );					
			}

//Choix modif				
				System.out.println("Veuillez choisir la pizza à modifier: ");
				tap = s.next();
				
				for(parc=0; parc<n; parc++){
						
					if (tap.equals(carte[parc][0]) ){
					
//Enregistrement modif
						System.out.print("Veuillez saisir le code: ");
					
					tap = s.next();
					
					carte[parc][0] = tap;
				
					System.out.print("Veuillez saisir le nom (sans espace): ");					
					tap = s.next();					
					carte[parc][1] = tap;
					
					System.out.print("Veuillez saisir le prix: ");
					
					l = s.nextFloat();
					
					carte[parc][2] = l;
					}
					
					else
					continue;
				}
				
				break;
				
			case(4) : System.out.println("vous avez choisi de supprimer une pizza!");
				break;
				
			case(99) : System.out.println("Au revoir :(");go=false;
				break;
				
			default: System.out.println("entrée incorrecte!");
			}
		
		}
	}	
}
