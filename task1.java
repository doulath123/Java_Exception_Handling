// Task1: Create a method divide which accepts two input numbers and prints the division result. Handle the exception when the one number is divided by zero and print the message


public class ExceptionHandling1{

    public static void main(String[] args){
        int result=divide(5,0);
        System.out.println("Result: "+result);
    }

    private static int divide(int i, int j){
        int result=0;
        try{
            result=i/j;
        }catch(ArithmeticException e){
            e.getMessage();
            System.out.println("Dividing with number:"+j);
        }
        return result;
    }
}