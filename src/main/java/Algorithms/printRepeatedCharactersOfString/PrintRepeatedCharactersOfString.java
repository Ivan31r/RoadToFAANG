package Algorithms.printRepeatedCharactersOfString;

import java.util.HashMap;
import java.util.Map;

public class PrintRepeatedCharactersOfString {
    private static final Integer initialValue = 1;
    public static void main(String[] args) {
        String testString = "chara cte  r";
        printRepeatedCharactersOfString(testString);
    }

    public static void printRepeatedCharactersOfString(String incomeString){
        Map<Character,Integer> characterMap = new HashMap<>();
        for (int i =0;i<incomeString.length();i++){
            char c = incomeString.charAt(i);
            if (characterMap.containsKey(c) && !String.valueOf(c).equals(" ")){
                characterMap.put(c, characterMap.get(c) +1);
                continue;
            }
            characterMap.put(c,initialValue);
        }
        printCharacters(characterMap);
    }
    public static void printCharacters(Map<Character,Integer> characterMap){
        characterMap.entrySet().stream().filter(characterIntegerEntry -> characterIntegerEntry.getValue()>1).map(Map.Entry::getKey).forEach(System.out::println);
    }
}
