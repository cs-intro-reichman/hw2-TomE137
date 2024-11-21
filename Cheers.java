// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0];
                int cheers = Integer.parseInt(args[1]);
                String an_list = "AEFHILMNORSX";
                String output = "";
                String name_uppercase = "";
                for (int i = 0; i<name.length(); i++) {
                        output = "Give me a  ";
                        name_uppercase += (char) (name.charAt(i)-32);
                        for (int j = 0; j<an_list.length(); j++) {
                                if (an_list.indexOf((char) (name.charAt(i) - 32)) != -1) {
                                        output = "Give me an ";
                                        break;
                                        
                                }
                        }                        
                        System.out.println(output + (char) (name.charAt(i) - 32) + ": " + (char) (name.charAt(i) - 32) + "!");
                }
                System.out.println("What does that spell?");
                while (cheers>0) {
                        System.out.println(name_uppercase+"!!!");
                        cheers -= 1;
                }
        }
}
