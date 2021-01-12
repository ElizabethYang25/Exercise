package codes;

import java.util.Scanner;

/*
* Author : elizabethyang
*Date : 9-Jan-2021
*Description: Vous enregistrez le pointage lors d’un match de basket-ball entre l’equipe des Ananas et l’equipe 
			  des Bananes. Les points sont marques par une equipe lorsqu’un joueur reussit un tir a 3 points, un
			  tir a 2 points, ou un tir a 1 point.
			  Determiner laquelle des equipes etait victorieuse ou si elles ont fait match nul.
*/
public class WinningScore
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				
				int a1, a2, a3;
				int b1, b2, b3;
				
				a3=sc.nextInt();
				a2=sc.nextInt();
				a1=sc.nextInt();
				b3=sc.nextInt();
				b2=sc.nextInt();
				b1=sc.nextInt();
				
				a3*=3;
				a2*=2;
				b3*=3;
				b2*=2;
				
				if (a1 + a2 + a3 > b1 + b2 + b3)
					System.out.println("A");
				else if (a1 + a2 + a3 < b1 + b2 + b3)
					System.out.println("B");
				else if (a1 + a2 + a3 == b1 + b2 + b3)
					System.out.println("T");
				
				sc.close();
				
			}
		
	}
