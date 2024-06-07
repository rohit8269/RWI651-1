package strings;

public class reverseStr {
    public static void main(String[] args) {
        String str = "this is a reverse string";

        StringBuilder str1 = new StringBuilder();
        str1.append(str);

//        reverse Stringbuilder str1
        str1.reverse();

        System.out.println(str1);
    }
}
