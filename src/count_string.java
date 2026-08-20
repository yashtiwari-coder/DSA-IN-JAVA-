import java .util.Scanner;
//frequency  question
public class count_string {
    public static void main(String[] args){
        String str ="programming";
        int[] ar = new int[128];
        for (char ch : str.toCharArray()){
            ar[ch]++;
        }
        for (char ch : str.toCharArray()){
            if (ar[ch] >0){
                System.out.println(ch + " " + ar [ch]);
                ar[ch] =0;
            }
        }
    }
































}
