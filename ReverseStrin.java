import java.util.Scanner;
public class ReverseStrin {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String");
        String num=sc.next();
        String rev="";
        for(int i=num.length()-1;i>=0;i--){
            rev=rev+ num.charAt(i);
        }
        System.out.println("Reverse of String\n"+rev);
        sc.close();
    }
    
}