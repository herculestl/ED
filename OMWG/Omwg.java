import java.util.*;
import java.lang.*;
import java.util.Scanner;

class Omwg {
       public static void main(String[] args) {     
    Scanner reader=new Scanner(System.in);
    int T=reader.nextInt();
    for(int i=0;i<T;i++){
    long n=reader.nextLong();
    long m=reader.nextLong();
    System.out.println(2*m*n-m-n);
    }  
}
}