import java.util.Scanner;
public class bms {
public static void main(){
   Scanner sc = new Scanner(System.in);
    System.out.print("Enter the height");
   int height = sc.nextInt();
    System.out.println("Enter the Weight");
    int weight = sc.nextInt();
    double bms = weight / Math.pow(height /100.0, 2);
    System.out.printf(" %.2f%n" , bms);
    if(bms<18.5){
        System.out.println("under weight");
    }
    else if(bms>=18.5 && bms<=24.9){
        System.out.println("Normal/healthy");
    }
    else if(bms>=25.0 && bms<=29.9){
        System.out.println("over weight");
    }
    else{
        System.out.println("obese");
    }






}
}
