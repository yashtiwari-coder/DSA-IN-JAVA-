import java.util.Scanner;
public class target {
public static void main(){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    System.out.println("Enter the size of array");
    int[] arr = new int[n];

    for(int i=0;i<n;i++){
        arr[i]= sc.nextInt();
    }
    System.out.println("Enter the target value ");
     int target = sc.nextInt();
     int result =-1;
     for(int i=0;i<n;i++){
         if(arr[i]==target){
             result=i;
             break;
         }
     }
    System.out.println("arr[i]" +result);






}
}
