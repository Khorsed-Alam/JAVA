package Lecture_Exception;

public class ExceptionHandle {
    public static void main(String[] args) {

        int []a= new int [5];
        System.out.println("Hello");
        try{
            System.out.println(a[8]);
        }catch (Exception E){
            E.printStackTrace();
        }
        System.out.println("Bye");
    }
}
