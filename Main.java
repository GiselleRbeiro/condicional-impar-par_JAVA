package exercice_par_impar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Sc = new Scanner (System.in);
		
		int entrada = Sc.nextInt();
	
	    
		if (entrada % 2 == 0) {
			System.out.println("PAR");
		}else {
			System.out.println("IMPAR");
		}
		
	Sc.close();
	 }
	}


