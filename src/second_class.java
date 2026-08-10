import java.util.Scanner;

public class second_class {
public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number ");
    int n = sc.nextInt();

    int count=0;
    int sum=0;
    int rev=0;
    while(n!=0){
        int digit = n%10;
        sum=sum+digit;
        rev=rev*10+digit;
        n=n/10;
        count ++;
    }
       System.out.println("total number " +count);
    System.out.println("the sum of " +sum);
    System.out.println("in reverse " +rev);






}
}
