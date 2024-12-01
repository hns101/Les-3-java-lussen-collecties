import java.util.HashMap;

public class Translator {

    HashMap<Integer,String> numericAlpa = new HashMap<>();


    public Translator(String[] alphabetic, Integer[] numeric) {
        for (int i = 0; i < alphabetic.length; i++) {
            numericAlpa.put(numeric[i],alphabetic[i]);

        }

    }

    public String translate(Integer number) {
        return numericAlpa.getOrDefault(number,"unknown");
    }
}
