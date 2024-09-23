package Lecture_Exception;

import java.util.Scanner;

public class CustomException {
    public static void main(String[] args) throws Exception{
        Scanner sc= new Scanner(System.in);
      try{
          int age= sc.nextInt();
          if(age>100){
              throw  new myException("My Error is This");
          }
      }catch (Exception E){
          System.out.println(E);
      }

    }
}
class  myException extends Exception{
    public myException (String message){
        super(message);
    }

}