import java.util.Scanner;
public class ArrAverage

    {
        public static void main(String[] args) 

        {   int n, sum = 0;
            float avg;
            Scanner s = new Scanner(System.in);
            System.out.print("Length of Array ");
            n = s.nextInt();
            int a[] = new int[n];
            System.out.println("Enter elements of array:");
            for(int i = 0; i < n ; i++)
            {
                a[i] = s.nextInt();
                sum = sum + a[i];
            }
            System.out.println("Sum of array elements:"+sum);
            avg = (float)sum / n;
            System.out.println("Average of elements is "+avg);
        }
    }