import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
        public static void main(String[] args) throws java.lang.Exception
        {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt();
                while (t--> 0) {
                        int n = sc.nextInt();
                        int arr[] = new int[n];
                        for (int i = 0; i < arr.length; i++) {
                                arr[i] = sc.nextInt();
                        }
                        int count = 1;
                        for (int i = 1; i < arr.length; i++) {
                                if (arr[i] > arr[i - 1]) {
                                        count++;
                                }
                        }
                        System.out.println(count);
                }

        }
}