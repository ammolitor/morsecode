package org.ammolitor;

import java.util.HashMap;

public class App {
    private static String USAGE = "Usage: ConvertString [to|from] StringToConvert";
    private static String TO = "to";
    private static String FROM = "from";
    private static HashMap<Character, String> characterStringHashMap = new HashMap<Character, String>();
    private static HashMap<String, Character> stringCharacterHashMap = new HashMap<String, Character>();

    public static void main(String[] args) {
        run(args[0], args[1]);
    }

    public static String run(String tf, String input) {
        String retval = new String();
        if (tf.equals(TO)) {
            fillCharacterMap();
            retval = convertTo(input);
            System.out.println("TO: " + retval);
        }
        if (tf.equals(FROM)) {
            fillStringMap();
            retval =  convertFrom(input);
            System.out.println("FROM: " + retval);
        }
        return retval;
    }

    public static String convertTo(String input) {
        StringBuilder sb = new StringBuilder();
        char[] chars = input.toUpperCase().toCharArray();
        for (int i = 0; i < chars.length; i++) {
            sb.append(characterStringHashMap.get(chars[i]) + " ");
        }
        return sb.toString();
    }

    public static String convertFrom(String input) {
        StringBuilder sb = new StringBuilder();
        String[] words = input.split(" \\| ");
        for (int i = 0; i < words.length; i++) {

            String[] letters = words[i].split(" ");
            for (int j = 0; j < letters.length; j++) {
                sb.append(stringCharacterHashMap.get(letters[j]));
            }
            sb.append(" ");

        }

        return sb.toString();
    }

    private static void fillStringMap() {
        stringCharacterHashMap.put("∙-", 'A');
        stringCharacterHashMap.put("-∙∙∙", 'B');
        stringCharacterHashMap.put("-∙-∙", 'C');
        stringCharacterHashMap.put("-∙∙", 'D');
        stringCharacterHashMap.put("∙", 'E');
        stringCharacterHashMap.put("∙∙-∙", 'F');
        stringCharacterHashMap.put("--∙", 'G');
        stringCharacterHashMap.put("∙∙∙∙", 'H');
        stringCharacterHashMap.put("∙∙", 'I');
        stringCharacterHashMap.put("∙---", 'J');
        stringCharacterHashMap.put("-∙-", 'K');
        stringCharacterHashMap.put("∙-∙∙", 'L');
        stringCharacterHashMap.put("--", 'M');
        stringCharacterHashMap.put("-∙", 'N');
        stringCharacterHashMap.put("---", 'O');
        stringCharacterHashMap.put("∙--∙", 'P');
        stringCharacterHashMap.put("--∙-", 'Q');
        stringCharacterHashMap.put("∙-∙", 'R');
        stringCharacterHashMap.put("∙∙∙", 'S');
        stringCharacterHashMap.put("-", 'T');
        stringCharacterHashMap.put("∙∙-", 'U');
        stringCharacterHashMap.put("∙∙∙-", 'V');
        stringCharacterHashMap.put("∙--", 'W');
        stringCharacterHashMap.put("-∙∙-", 'X');
        stringCharacterHashMap.put("-∙--", 'Y');
        stringCharacterHashMap.put("--∙∙", 'Z');
        stringCharacterHashMap.put("∙----", '1');
        stringCharacterHashMap.put("∙∙---", '2');
        stringCharacterHashMap.put("∙∙∙--", '3');
        stringCharacterHashMap.put("∙∙∙∙-", '4');
        stringCharacterHashMap.put("∙∙∙∙∙", '5');
        stringCharacterHashMap.put("-∙∙∙∙", '6');
        stringCharacterHashMap.put("--∙∙∙", '7');
        stringCharacterHashMap.put("---∙∙", '8');
        stringCharacterHashMap.put("----∙", '9');
        stringCharacterHashMap.put("-----", '0');
        stringCharacterHashMap.put("|", ' ');
        stringCharacterHashMap.put("|", '"');
        stringCharacterHashMap.put("|", '.');
        stringCharacterHashMap.put("|", '?');
        stringCharacterHashMap.put("|", '!');
    }

    private static void fillCharacterMap() {
        characterStringHashMap.put('A', "∙-");
        characterStringHashMap.put('B', "-∙∙∙");
        characterStringHashMap.put('C', "-∙-∙");
        characterStringHashMap.put('D', "-∙∙");
        characterStringHashMap.put('E', "∙");
        characterStringHashMap.put('F', "∙∙-∙");
        characterStringHashMap.put('G', "--∙");
        characterStringHashMap.put('H', "∙∙∙∙");
        characterStringHashMap.put('I', "∙∙");
        characterStringHashMap.put('J', "∙---");
        characterStringHashMap.put('K', "-∙-");
        characterStringHashMap.put('L', "∙-∙∙");
        characterStringHashMap.put('M', "--");
        characterStringHashMap.put('N', "-∙");
        characterStringHashMap.put('O', "---");
        characterStringHashMap.put('P', "∙--∙");
        characterStringHashMap.put('Q', "--∙-");
        characterStringHashMap.put('R', "∙-∙");
        characterStringHashMap.put('S', "∙∙∙");
        characterStringHashMap.put('T', "-");
        characterStringHashMap.put('U', "∙∙-");
        characterStringHashMap.put('V', "∙∙∙-");
        characterStringHashMap.put('W', "∙--");
        characterStringHashMap.put('X', "-∙∙-");
        characterStringHashMap.put('Y', "-∙--");
        characterStringHashMap.put('Z', "--∙∙");
        characterStringHashMap.put('1', "∙----");
        characterStringHashMap.put('2', "∙∙---");
        characterStringHashMap.put('3', "∙∙∙--");
        characterStringHashMap.put('4', "∙∙∙∙-");
        characterStringHashMap.put('5', "∙∙∙∙∙");
        characterStringHashMap.put('6', "-∙∙∙∙");
        characterStringHashMap.put('7', "--∙∙∙");
        characterStringHashMap.put('8', "---∙∙");
        characterStringHashMap.put('9', "----∙");
        characterStringHashMap.put('0', "-----");
        characterStringHashMap.put(' ', "|");
        characterStringHashMap.put('"', "|");
        characterStringHashMap.put('.', "|");
        characterStringHashMap.put('?', "|");
        characterStringHashMap.put('!', "|");
    }

}
