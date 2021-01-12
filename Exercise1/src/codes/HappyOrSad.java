package codes;

import java.util.Scanner;

/*
* Author : elizabethyang
*Date : 11-Jan-2021
*Description: On utilise souvent des frimousses (binettes) dans des textos pour indiquer comment on se sent. Les
			  trois caracteres consecutifs :-) indiquent un visage joyeux et les trois caracteres consecutifs :-(
			  indiquent un visage triste. Ecrivez un programme qui determine l’humeur globale d’un message.
*/
public class HappyOrSad
	{

		public static void main(String[] args)
			{
				Scanner sc=new Scanner(System.in);
				String monText;  
				int i=0;
				int happy=0;
				int sad=0;
				
				System.out.println("text");
                monText = sc.nextLine();
                
                for(int i1=0; i1<monText.length();i1++);
                if(monText.charAt(i) == ':' && monText.charAt(i+1) == '-')
					if (monText.charAt(i+2)== ')')
                	{
						happy+=1;
                	}
					else if (monText.charAt(i+2)== '(')
					{
						sad+=1;
					}
                if (happy > sad)
                	System.out.println("Happy");
                else if (happy < sad)
                	System.out.println("Sad");
                else if (happy == sad)
                	System.out.println("unsure");
                else if (happy == 0 && sad == 0)
                	System.out.println("none");
                
               sc.close(); 
			}

	}
