import java.util.Scanner;
public class electricity {
public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("enter the unit");
    int units = sc.nextInt();
    double bill =0;
    if(units<=100){
        bill=units*1;
    }
    else if(units<=200){
        bill=((units-100)*2)+100*1;
    }
    else{
        bill=((units-200)*3)+(100*2)+(100*1);
    }

    System.out.println(bill);


}
}
