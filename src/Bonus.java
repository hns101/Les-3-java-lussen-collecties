import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;

public class Bonus {

    public static void main(String[] args) {


        HashSet<Integer> secretnumber = randomnumbergenerator();
        String stringnumber = setToStringConverter(secretnumber);
//      System.out.println(stringnumber);
        feedback(stringnumber);

    }

    public static HashSet<Integer> randomnumbergenerator(){

        java.util.Random rand = new java.util.Random();
        HashSet<Integer> set = new HashSet<>();

        while (set.size() < 4) {
            set.add(rand.nextInt(10));
        }
        return set;

    }

    public static String setToStringConverter(HashSet<Integer> secretnumber){

        StringBuilder sb = new StringBuilder();

        for (Integer i : secretnumber) {
            sb.append(i);
        }
        return sb.toString();
    }



    public static void feedback(String stringnumber) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder feedback = new StringBuilder();
        boolean play = false;

        while (!play) {

        System.out.println("+ = juiste nummer op de juiste plek, O = juiste nummer verkeerde plek, X = verkeerde nummer");
        System.out.println("Doe een gok, Let op vul 4 getallen in.");
        String guess = scanner.nextLine();
        if (Objects.equals(guess, stringnumber)) {
            System.out.println("gefeliciteerd je hebt het goed");
            play = true;
        }
        else {
            for (int i = 0; i < 4; i++) {
                if (guess.substring(i, i + 1).equals(stringnumber.substring(i, i + 1))) {
                    feedback.append("+");
                } else if (stringnumber.contains(guess.substring(i, i + 1))) {
                    feedback.append("0");
                } else {
                    feedback.append("X");
                }
            }
        }
        System.out.println(feedback.toString());
        feedback.setLength(0);
        }
    }
}
// HashSet slaat geen gelijken nummers op naast elkaar en een HashMap wel, dan hoefte je er geen een nummer van te maken
//  maar kon je deze nummers naast elkaar plaatsen in de HashMap.