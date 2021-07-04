
public class fuzzbuzz {

	public static void main(String[] args) {
		int nombre  ;
		String affiche;
		
		for (nombre =1 ; nombre <=100 ; nombre ++) {
			/* solution 1
			if (nombre % 3 ==0  && nombre % 5 ==0) {
				System.out.println("FizzBuzz");
			}
			else if(nombre % 3 ==0 ) {
				System.out.println("Fizz");
			}
			else if (nombre % 5 ==0) {
				System.out.println("Buzz");
			}
			else {System.out.println(nombre);}
			*/
			affiche="";
			if(nombre % 3 ==0 ) {
				affiche = affiche+"Fizz";
			}
			if (nombre % 5 ==0) {
				affiche = affiche+"Buzz";
			}
			if (affiche.isEmpty()) {
				System.out.println(nombre);
			} else {
				System.out.println(affiche);
			}
		}
		

	}

}
