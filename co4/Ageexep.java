import java.util.Scanner;
class AgeException extends Exception{
    AgeException(String m){
        super(m);
    }
}
class Age{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        try{
        System.out.println("Enter your Age:");
        int age=sc.nextInt();
        if(age<18){
            throw new AgeException("Not Eligible To Vote!!");
        }
        else{
            System.out.println("Welcome!!");
        }
        }
        catch(Exception e){
  System.out.println("Exception---"+e);
}

}
}
