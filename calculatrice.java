import java.util.*;

public class calculatrice
{ 
	public static void main(String[] args)
	{ 
		String nom;
		char signe;
		double a,b,result;

		System.out.println("");
		System.out.println("");

		nom = "Le Testeur";

		signe = '+';
		a = b = result = 0;
		
		presentation(nom);
		result = calcul(signe, a, b);
		
		System.out.println("Le resultat est : "+result+" !");
		System.out.println("Merci "+nom+". A plus !");
	}
	
	public static void presentation(String testeur)
	{
		System.out.println("");
		System.out.println("");

		System.out.println("******Calculatrice basique*******");
		System.out.println("");
		System.out.println("");

		System.out.println("Salut "+testeur+" !");
		System.out.println("");
	}

	public static double calcul(char p, double x, double y)
	{
		double r=0;
		
		System.out.println("[Un robot choisi aleatoirement les parametres de la calculatrice (signe, x, y)]");
		System.out.println("le tirage nous donne : ");
		
		Random cart = new Random();
	    	String op = "+-*/";
	    	p = op.charAt(cart.nextInt(op.length()));
		System.out.println("-) "+p);
		
		Random r1 = new Random();
		x = r1.nextInt(100) + 1;
		System.out.println("-) "+x);
		
		Random r2 = new Random();
		y = r2.nextInt(100) + 1;
		System.out.println("-) "+y);
		System.out.println("");
		
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
