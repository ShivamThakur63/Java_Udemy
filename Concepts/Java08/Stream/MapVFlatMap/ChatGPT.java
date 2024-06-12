package Concepts.Java08.Stream.MapVFlatMap;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ChatGPT {


    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "java");

        // 1. Calculate the length of each word and store it as an integer using mapToInt
        int[] wordLengths = words.stream()
                                 .mapToInt(String::length)
                                 .toArray();

        System.out.println("Word lengths: " + Arrays.toString(wordLengths));

        // 2. Transform each word to its uppercase form using map
        List<String> upperCaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        System.out.println("Uppercase words: " + upperCaseWords);

        // 3. Split each word into its individual characters using flatMap
        List<Character> characters = words.stream()
                                          .flatMap(word -> word.chars().mapToObj(ch -> (char) ch))
                                          .collect(Collectors.toList());

        System.out.println("Characters: " + characters);

        // 4. Calculate the Unicode value of each character and store it as an integer using mapToInt
        int[] unicodeValues = words.stream()
                                  .flatMapToInt(word -> word.chars())
                                  .toArray();

        System.out.println("Unicode values: " + Arrays.toString(unicodeValues));
    }

    
}
