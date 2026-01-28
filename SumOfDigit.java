
import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number");
        int num=sc.nextInt();
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=rem+sum;
            num=num/10;
        }
        System.out.println("Total Number of Digits"+sum
        );
        sc.close();
    }
}
