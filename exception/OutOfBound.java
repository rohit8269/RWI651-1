package exception;

public class OutOfBound {
    public static void main(String[] args) {
        try{
        int a[] = new int[5];
        a[10] = 50;
        }

        catch (Exception e){
            System.out.println(e);
        }

        System.out.println("rest code of the program");
    }
}
