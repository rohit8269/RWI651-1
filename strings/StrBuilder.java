package strings;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("mohan");
        System.out.println(sb);

//         character at index 0
        System.out.println(sb.charAt(0));

//        set character  at index 0 we can change the string with the help of setCharAt() keyword
        sb.setCharAt(0, 'r');
        System.out.println(sb);

//        indert the char in string at 1 index
        sb.insert(1, 'o');
        System.out.println(sb);

//        delete the extra 'o' and index 1 se 2 tak and ending index ak km tak jayega jese end hmne 2 diya to vo 1 tak hi jayega
        sb.delete(1,2);
        System.out.println(sb);
    }
}
