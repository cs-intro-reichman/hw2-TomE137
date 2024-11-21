// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	 
	int reps = Integer.parseInt(args[0]);
	double pi_calc = 1.0, counter = 3.0;

	for (int i = 0; i < reps-1; i++) {
	   if(i%2==0){
		pi_calc -= (1.0/counter);
	   }
	   else{
		pi_calc += (1.0/counter);
	   }
	   counter += 2.0;
	  }
	  System.out.println("pi according to Java: " + Math.PI);
	  System.out.println("pi, approximated:     " + pi_calc*4);
	}
   }