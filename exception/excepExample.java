package exception;

public class excepExample {
    public static void main(String args[]){
        try{
            //code that may raise exception
            int data= 50/0;
        }catch(Exception e){
            System.out.println(e);
        }
        //rest code of the program
        System.out.println("rest code...");
    }
}
