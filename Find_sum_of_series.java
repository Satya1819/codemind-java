import java.util.Scanner;
class Series
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int b=s.nextInt();
        float a,temp=0;
        for(float i=1;i<=b;i++)
        {
            a=(1/i);
            temp=temp+a;
        }
        System.out.printf("%.2f",temp);
    }
}