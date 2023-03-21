package SentimentAnalysis;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Using nothing but a list of negative words, create a program that performs sentiment analysis by counting the number of occurrences of those words in a text excerpt and using that number against the total number of words to calculate a percentage. The result should then match the following criteria:
 * <=5%  -> POSITIVE
 * 5-20% -> NEUTRAL
 * =20% -> NEGATIVE
 *
 * Note 1: Words shorter than 3 characters should not be considered.
 * Note 2: Only spaces, commas, fullstops and exclamation marks should be used as delimiters when extracting words from the text input.
 * Please use the following negative word list to run tests with the given examples:
 * [bad, ugly, terrible, awful, stupid, mad, angry, sad]
 * EXAMPLES:
 *
 * Input 1: The world is a terrible place to live in. Terrible!
 * Output 1: NEGATIVE
 *
 *
 * Input 2: Today I saw a bunch of beautiful butterflies, and they all looked so happy! All except for one that looked a bit sad and lonely.
 * Output 2: POSITIVE
 *
 *
 * Input 3: I'm going shopping and I'm super excited. The awful thing is that the boots I wanted are no longer in sale, which makes me a bit angry, because I now have to pay full price.
 * Output 3: NEUTRAL
 */

public class SentimentAnalysis {
    public String sentimentAnalyzer(String textExcerpt) {
        double count = 0;
        List<String> negativeWords = Arrays.asList("bad", "ugly", "terrible", "awful", "stupid", "mad", "angry", "sad");

        var sortedText = Arrays.stream(textExcerpt.split("[\\p{P}\\s]+")).map(String::toLowerCase).collect(Collectors.toList());

         for (String word: sortedText) {
            if (negativeWords.contains(word)) {
                count+= 1;
            }
        }
        double percentage = (count / sortedText.size()) * 100;
        return getSentiment(percentage);
    }

    private String getSentiment(double percentage) {
        if (percentage <= 5.0) {
            return "POSITIVE";
        } else if (percentage >= 20.0) {
            return "NEGATIVE";
        }
        return "NEUTRAL";
    }

    public static void main(String[] args) {
        SentimentAnalysis analysis = new SentimentAnalysis();
        System.out.println(analysis.sentimentAnalyzer("The world is a terrible place to live in. Terrible!"));
        System.out.println(analysis.sentimentAnalyzer("Today I saw a bunch of beautiful butterflies, and they all looked so happy! All except for one that looked a bit sad and lonely."));
        System.out.println(analysis.sentimentAnalyzer("I'm going shopping and I'm super excited. The awful thing is that the boots I wanted are no longer in sale, which makes me a bit angry, because I now have to pay full price."));
    }
}
