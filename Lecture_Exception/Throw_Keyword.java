package Lecture_Exception;

public class Throw_Keyword {
    public static void main(String[] args) {
        int []a= new int [5];
        System.out.println("hello World");

        try{
            getNumberFromArray(a);
        }catch (Exception  E){
            System.out.println("Catch the Exception: "+E.getMessage());
        }

    }
    static int getNumberFromArray(int a[])throws ArithmeticException{
        return a[8];
    }
}

