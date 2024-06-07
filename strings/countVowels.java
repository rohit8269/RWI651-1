package strings;

public class countVowels {
    public static void main(String[] args) {
     String string = "this is a program for count of vowels and consonent with the help of string";
     int Vowelcount = 0, conCount = 0;

        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i) == 'a' || string.charAt(i) == 'i' || string.charAt(i) == 'e' || string.charAt(i) == 'o' || string.charAt(i) == 'u') {
                Vowelcount++;
            } else {
                conCount++;
            }
        }

        System.out.println("the Vowels count is " + Vowelcount);
        System.out.println("the consonent count is "+ conCount);
      }
}
