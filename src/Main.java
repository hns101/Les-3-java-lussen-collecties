import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer[] numeric = {0,1,2,3,-5,4,5,6,7,8,9};
        String[] alphabetic = {"Nul","Een","Twee","Drie","Min Vijf","Vier","Vijf","zes","zeven","Acht","Negen"};

        Translator translator = new Translator(alphabetic,numeric);

        System.out.println(translator.translate(6));
        Scanner scanner = new Scanner(System.in);

        boolean play = true;

        while (play){
            System.out.println("Type 'x' om te stoppen \nType 'v' om te vertalen");
            String input = scanner.nextLine();
            if (input.equals("x")){
                play = false;
            } else if (input.equals("v")) {
                System.out.println("Type een cijfer in van 0 t/m 9");
                Integer number = scanner.nextInt();
                System.out.println("De vertaling van " + number + " is " + translator.translate(number));
                scanner.nextLine();
            }
            else {
                System.out.println("ongeldige keuze probeer opnieuw");
            }
        }



    }
}
