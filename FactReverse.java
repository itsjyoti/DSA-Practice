import java.util.Scanner;
class factorial{
    int f(int num){
    if(num==0 || num==1){
        return 1;
    }else {
        return num*f(num-1);
    }
}}
public class FactReverse {
    public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Number");
    int num=sc.nextInt();
    factorial obj=new factorial();
    int result=obj.f(num);
    System.out.println("Factorial Number"+result);
    sc.close();
    }
}
