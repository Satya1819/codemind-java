import java.util.Scanner;
class Playfibonici
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,temp;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<n;i++)
        {
            temp=a+b;
            System.out.print(temp+" ");
         a=b;
        b=temp;
        }
    }
}