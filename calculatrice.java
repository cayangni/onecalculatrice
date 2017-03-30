import java.util.*;
import java.util.Scanner;

public class calculatrice
{ 
	public static void main(String[] args)
	{ 
		char signe;
		double a,b,result;

		System.out.println("");
		System.out.println("");

		signe = '+';
		a = b = result = 0;

		presentation();
		result = calcul(signe, a, b);
		
		System.out.println("Le resultat est : "+result+" !");
		System.out.println("Merci . A plus !");
	}

	public static void presentation()
	{
		System.out.println("");
		System.out.println("");

		System.out.println("******Calculatrice basique*******");
		System.out.println("");
		System.out.println("");

	}

	public static double calcul(char p, double x, double y)
	{
		double r=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir le type d'opération (+,-,*,/) :");
		p = sc.next().charAt(0);

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Veuillez saisir la première variable :");
		x = sc1.nextDouble();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Veuillez saisir la seconde variable :");
		y = sc2.nextDouble();

		switch(p) 
		{
			case '+' :
			r = x+y; 
			break;

			case '-' :
			r = x-y;
			break;
			
			case '*' :
			r = x*y;
			break;

			case '/' :
			r=x/y;
			break;

			default :
			System.out.println("Erreur à l'entrée...");
			break;
		}

		return r;
	}

}
