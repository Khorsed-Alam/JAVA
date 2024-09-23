package Lecture_Exception;

public class ArithmeticExceptionDemo {
    public static void main(String[] args) {
        System.out.println("Hello");
        try{
            int result=5/0;
        }catch (ArithmeticException E){
             E.printStackTrace();
        }
        System.out.println("bye");
    }
}
