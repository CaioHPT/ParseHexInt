import java.util.HashMap;
import java.util.Map;

public class Main {

    public static Integer parseHexInt(String hexadecimal) {
        Map<Character, Integer> letters = new HashMap<Character, Integer>();

        letters.put('0', 0);
        letters.put('1', 1);
        letters.put('2', 2);
        letters.put('3', 3);
        letters.put('4', 4);
        letters.put('5', 5);
        letters.put('6', 6);
        letters.put('7', 7);
        letters.put('8', 8);
        letters.put('9', 9);
        letters.put('A', 10);
        letters.put('B', 11);
        letters.put('C', 12);
        letters.put('D', 13);
        letters.put('E', 14);
        letters.put('F', 15);

        Double counter = 0.0;
        Double sum = 0.0;
        Integer contEqualsCharacter = 0;

        for (int i = hexadecimal.length(); i > 0; i--) {
            for (Map.Entry<Character, Integer> letrasEntry : letters.entrySet()) {
                if (hexadecimal.charAt(i - 1) == letrasEntry.getKey()) {
                    contEqualsCharacter += 1;
                }
            }
        }

        if (contEqualsCharacter == hexadecimal.length()) {
            for (int i = hexadecimal.length(); i > 0; i--) {
                sum += letters.get(hexadecimal.charAt(i - 1)) * Math.pow(16.0, counter);
                counter += 1;
            }

            return sum.intValue();
        } else {
            System.out.println("Digite apenas numeros de 0 té 9 e letras de A até F");
            return null;
        }
    }

    public static void main(String[] args) {
        System.out.println(Main.parseHexInt("1AF"));
        System.out.println(Main.parseHexInt("1F"));
        System.out.println(Main.parseHexInt("1A"));

    }
}
