// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String name = args[0].toUpperCase();
                int cheers = Integer.parseInt(args[1]);
                String an_list = "AEFHILMNORSX";
                String output = "";
                for (int i = 0; i<name.length(); i++) {
                        output = "Give me a  ";
                        for (int j = 0; j<an_list.length(); j++) {
                                if (an_list.indexOf(name.charAt(i)) != -1) {
                                        output = "Give me an ";
                                        break;
                                        
                                }
                        }                        
                        System.out.println(output + name.charAt(i) + ": " + name.charAt(i) + "!");
                }
                System.out.println("What does that spell?");
                while (cheers>0) {
                        System.out.println(name+"!!!");
                        cheers -= 1;
                }
        }
}
