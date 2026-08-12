import java.util.Scanner;
public class avg {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int []arr= new int[n];
        double sum=0;
        for(int i=0; i<n;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        double avg=(double)sum/n;

        System.out.println("average is " +avg);











    }
}
