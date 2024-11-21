// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int N = Integer.parseInt(args[0]);
		String mode = args[1];
		int hail = 0;
		int counter = 1;
		String output = "";
		for(int i = 1; i <= N; i++) {
			output += i + " ";
			while (hail != 1) {
				if (hail == 0) {
					hail++;
				}
				if (hail%2==0) {
					hail = hail/2;
				}
				else {
					hail = hail * 3 + 1;
				}
				output += hail + " ";
				counter++;
			}
			if (mode.indexOf("v") != -1) {
				System.out.println(output + "(" + counter + ")");
				output = "";
				counter = 1;
			}
			hail = i + 1;
		}
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}
}
