//Kobe Miller
//2-12-16
//lab03
//This is a basic calculator
//It will find how much each person has to pay
//From the whole bill, and tip

public class Scramble {

    public static String scramble(String str) {   
        StringBuilder newStringBuilder = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder(str);

        while (stringBuilder.length() > 0) {
            int n = (int)(Math.random() * stringBuilder.length());
            newStringBuilder.append(stringBuilder.charAt(n));
            stringBuilder.deleteCharAt(n);
        }

        return newStringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(scramble("hola"));
    }
}