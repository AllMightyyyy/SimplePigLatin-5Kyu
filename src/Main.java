// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.

        Examples
        pigIt('Pig latin is cool'); // igPay atinlay siay oolcay
        pigIt('Hello world !');     // elloHay orldway !
         */
        System.out.println(pigIt("Pig latin is cool"));
    }
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (Character.isLetter(words[i].charAt(0))) {
                words[i] = words[i].substring(1) + words[i].charAt(0) + "ay";
            }
            sb.append(words[i]).append(" ");
        }
        return sb.toString().trim();
    }
}