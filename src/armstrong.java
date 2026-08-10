import java.util.Scanner;
public class armstrong {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();
    int orginal=num;
    int temp=num;
    double count=0;
    double sum=0;
    while(temp!=0){
       temp= temp/10;
       count++;
    }
  while(num!=0){
      double digit = num%10 ;
      sum = sum+Math.pow(digit,count);
      num=num/10;


  }
    if(orginal==sum){
        System.out.println("Armstrong");
    }
    else{
        System.out.println("Not a Armstrong");
    }





    }



}
