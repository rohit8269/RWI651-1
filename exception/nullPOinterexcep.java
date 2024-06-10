package exception;

public class nullPOinterexcep {
    public static void main(String[] args) {
        try {
            String N = null;
//        nullPointerException
            System.out.println(N.length());
        }
        catch (Exception e){
            System.out.println(e);
        }
        System.out.println("rest code of the program");
    }
}
