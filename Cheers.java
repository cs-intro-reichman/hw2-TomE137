// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                int cheers = Integer.parseInt(args[1]);
                String an_list = "AEFHILMNORSX";
                String output = "";
                String name_uppercase = "";
                int upper_letter = 32;
                for (int i = 0; i<name.length(); i++) {
                        output = "Give me a  ";
                        if (name.charAt(i)+1 > 98) {
                                upper_letter = 32;
                        } 
                        else {
                                upper_letter = 0;       
                        }
                        name_uppercase += (char) (name.charAt(i)-upper_letter);
                        for (int j = 0; j<an_list.length(); j++) {
                                if (an_list.indexOf((char) (name.charAt(i) - upper_letter)) != -1) {
                                        output = "Give me an ";
                                        break;
                                        
                                }
                        }                        
                        System.out.println(output + (char) (name.charAt(i) - upper_letter) + ": " + (char) (name.charAt(i) - upper_letter) + "!");
                }
                System.out.println("What does that spell?");
                while (cheers>0) {
                        System.out.println(name_uppercase+"!!!");
                        cheers -= 1;
                }
        }
}
