//Kobe Miller
//2-12-16
//lab03
//This is a basic calculator
//It will find how much each person has to pay
//From the whole bill, and tip




public class Shuffle {
    public static void main(String[] args) {
        Shuffle s = new Shuffle();
        s.shuffle("hello");

    }
    public void shuffle(String input){
        List<Character> characters = new ArrayList<Character>();
        for(char c:input.toCharArray()){
            characters.add(c); 
        }
        StringBuilder output = new StringBuilder(input.length());
        while(characters.size()!=0){
            int randPicker = (int)(Math.random()*characters.size());
            output.append(characters.remove(randPicker));
        }
        System.out.println(output.toString());
    }
}