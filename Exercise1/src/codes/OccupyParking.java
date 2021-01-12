package codes;

import java.util.Scanner;

/*
* Author : elizabethyang
*Date : 11-Jan-2021
*Description: Vous etes responsable d’un parc de stationnement de N places. Hier vous avec note les places de 
			  stationnement qui etaient occupees. Aujourd’hui vous avec note les memes renseignements.
			  Combien de places ont ete occupees les deux jours, soit hier et aujourd’hui ?
*/
public class OccupyParking
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				
				int N;
				int empty=0;
				int occupied=0;
				int i=0;
				
				System.out.println("parking spaces");
                N = sc.nextInt();
                String yesterday=sc.next();
				String today=sc.next();
                
                for(int i1=0; i1< N;i1++);
                if (yesterday.charAt(i) == 'C' && today.charAt(i) == 'C');
                	{
                		occupied+=1;
                	}
                System.out.println(occupied);
			}

	}
