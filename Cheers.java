
public class Cheers {
        public static void main(String[] args) {
                String name = args[0].toUpperCase();
                int cheerTimes = Integer.parseInt(args[1]);
                String specialLetters = "AEFHILMNORSX";

                for(int i = 0; i < name.length(); i++){
                        char letter = name.charAt(i);
                        if (specialLetters.indexOf(letter) >= 0) {
                        System.out.println("Give me an " + letter + ": " + letter + "!");
                               
                        }
                        else{
                        System.out.println("Give me a  " + letter + ": " + letter + "!");

                        }
                }

                System.out.println("What does that spell?");

                for(int x = 0; x < cheerTimes; x++){
                        System.out.println(name + "!!!");
                }
        }
}
