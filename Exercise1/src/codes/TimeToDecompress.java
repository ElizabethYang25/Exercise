package codes;

import java.util.Scanner;

/*
* Author : elizabethyang
*Date : 11-Jan-2021
*Description: Votre ami et vous avez trouve un moyen de vous envoyer des messages codes. 
			  Votre ami peut encoder un message en ecrivant un entier positif, N, et un symbole. Vous pouvez
			  decoder ce message en ecrivant ce symbole N fois dans une seule ligne.
			  Votre ami a encode un message, decodez-le.
*/
public class TimeToDecompress
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				
				int code;
				int i=0;
				
				code = sc.nextInt();
                code = sc.nextInt();
                code = sc.nextInt();

                for(int i1=0; i1<code;i1++);
                if (code.charAt(i) == 'N' && code.charAt(i+2) == 'x'); 
                	{
                		code+=1;
                	}

			}


	}
