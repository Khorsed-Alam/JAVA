package Lecture_Exception;

public class ExceptionHandle {
    public static void main(String[] args) {

        int []a= new int [5];
        System.out.println("Hello");
        try{
            int result= 10/0;
            System.out.println(a[8]);
        }catch (ArithmeticException | ArrayIndexOutOfBoundsException E){
            E.printStackTrace();
        }
        System.out.println("hi");
    }
}


