package strings;

public class concatStr {
    public static void main(String[] args){
        String firstname = "rohit";
        String lastname = "rajak";
        String fullname = firstname + "@" + lastname;
        System.out.println("your name is : " + fullname);

//        for  length
        System.out.println("The length of string is " + fullname.length());

//        use of charAt we can access charactor one by one
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }
    }
}
