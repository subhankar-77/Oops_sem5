import java.util.*;
class GoldenRatioTable
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term of fibonacci series");
        int n=sc.nextInt();
        int a=1, b=1;
        int c=a+b;
        double r = (double) b/a;
        System.out.println("First term \t Second term \t Golden ratio table");
        System.out.println("---------------------------------------------------");
        for (int i=2;i<=n; i++)
        {
            System.out.println(a+ "\t \t \t"+ b +"\t \t \t"+ r);
            System.out.println("---------------------------------------------------");
            a=b;
            b=c;
            c=a+b;
            r=(double) b/a;
        }
        sc.close();
    }
}