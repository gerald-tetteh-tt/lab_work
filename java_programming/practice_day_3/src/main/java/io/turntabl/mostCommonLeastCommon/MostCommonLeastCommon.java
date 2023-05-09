package io.turntabl.mostCommonLeastCommon;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class MostCommonLeastCommon {

    public Map<String, List<String>> mostCommonLeastCommon(int mostCount, int leastCount) {
        List<String> words = readWords();
        Map<String,Integer> wordCount = new HashMap<>();
        for (String word: words) {
            int count = wordCount.getOrDefault(word,0);
            wordCount.put(word,count + 1);
        }

        if(mostCount > wordCount.size() || leastCount > wordCount.size()) {
            throw new IllegalArgumentException("Least or most count greater than available");
        }

        // Using streams
        List<String> sortedWordCount = wordCount
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .toList();

        List<String> mostCommon = new ArrayList<>();
        List<String> leastCommon = new ArrayList<>();
        Map<String,List<String>> result = new HashMap<>();
        result.put("mostCommon",mostCommon);
        result.put("leastCommon",leastCommon);

        int listSize = sortedWordCount.size();
        for(int i = 0; i < leastCount; i++) {
            leastCommon.add(sortedWordCount.get(i));
        }
        for(int i = listSize - 1; i >= (listSize - mostCount); i--) {
            mostCommon.add(sortedWordCount.get(i));
        }

        return result;
    }

    public List<String> readWords() {
        List<String> wordsList = new ArrayList<>();
        Scanner reader = null;
        try {
            File words = new File("C:\\Users\\gerald.addo-tetteh\\Documents\\lab_work\\java_programming\\practice_day_3\\src\\main\\java\\io\\turntabl\\mostCommonLeastCommon\\words.txt");
            reader = new Scanner(words);
            while(reader.hasNextLine()) {
                wordsList.add(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        } finally {
            if(reader != null) {
                reader.close();
            }
        }
        return wordsList;
    }
}
