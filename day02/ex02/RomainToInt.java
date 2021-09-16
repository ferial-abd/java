 import java.util.*;

class Main {


	public static void main(String args[]) { 

	Scanner x = new Scanner(System.in);
	System.out.println("veuillez entrer un nombre Romain: "); 
	String number = x.nextLine() ; 
	int valeur = 0 ;

	for (int i=0 ; i < number.length() ; i++ ){
	char numRomain = number.charAt(i);
	switch(numRomain){
		case('M'):
		valeur = valeur + 1000 ; 
		break;
		case('D'):
		valeur = valeur + 500 ; 
		break;
		case('C'):
		valeur = valeur + 100 ; 
		break;
		case('L'):
		valeur = valeur + 50 ; 
		break;
		case('X'):
		valeur = valeur + 10 ; 
		break;
		case('V'):
		valeur = valeur + 5 ; 
		break;
		case('I'):
		valeur = valeur + 1 ; 
		break;
	}

	}System.out.println(valeur); 
	}
}