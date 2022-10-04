import java.util.Scanner;

public class arraygame
{
    static int arr[];
    static int leap;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arraygame ob = new arraygame();
        int n;
        System.out.println("Enter the number of queries");
        int q = sc.nextInt();

        while (q-- > 0)
        {
            System.out.println("Enter the length of the array");
            n = sc.nextInt();
            arr = new int[n];
            System.out.println("Enter the value of leap");
            leap = sc.nextInt();
            System.out.println("Enter the values in array");
            for (int i = 0; i < n; i++)
            {
                arr[i] = sc.nextInt();
            }
            boolean result = canwin(leap, arr);
            if(result==true)
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
    static boolean canwin(int leap,int arr[])
        {
            int n=arr.length;
            int top=0;
            for(int i=0;i<1;i++)
            {
                for(int j=0;j<arr.length;j++)
               {
                   if (top!=0 && arr[top-1]==0)
                   {
                       top=top-1;
                   }
                   if(top+leap<n && arr[top+leap]==0)
                   {
                       top=top+leap;
                   }
                   if (top<n-1 && arr[top+1]==0)
                   {
                           top=top+1;
                   }
                   if(top+leap<n && arr[top+leap]==0)
                   {
                       top=top+leap;
                   }
                   if(top+leap>=n)
                   {
                       top=n;
                       break;
                   }
                   if(top==n-1)
                   {
                       top=n;
                       break;
                   }
               }
            }
            if(top==n)
                return true;
            else
                return false;
        }
}
