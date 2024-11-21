public class TimeCalc {
    public static void main(String[] args) {
        // Replace this comment with your code
        int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int added_minutes = Integer.parseInt(args[1]);
        String output = "";
        hours = (hours+(minutes+added_minutes)/60)%24;
        minutes = (minutes+added_minutes)%60;
        if (hours < 10) {
            output = "0";
        }
        output += hours + ":";
        if (minutes < 10) {
            output += "0";
        }
        System.out.println(output+minutes);
    }
}
