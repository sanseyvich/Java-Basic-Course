package ua.artcode.basic.week2.homework;

/**
 * Created by olsas on 2/29/2016.
 * <p>
 * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this example, the "i" tag makes <i> and </i>
 * which surround the word "Yay". Given tag and word strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
 * makeTags("i", "Yay") → "<i>Yay</i>"
 * makeTags("i", "Hello") → "<i>Hello</i>"
 * makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
public class _3CodingBatString1_3 {
    public String makeTags(String tag, String word) {
        return String.format("<%1$s>%2$s</%1$s>", tag, word);
    }
}
