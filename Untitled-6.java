import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        // Your code here
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long k=sc.nextLong();
        long odd=(n+1)/2;
        long even=n/2;
        long ans=(k<=odd)?(2*k-1):(2*(k-odd));
        System.out.println(ans);
    }
}