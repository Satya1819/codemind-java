import java.util.Scanner;
class Square
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(i*i==n)
            {
                System.out.println("True");
                break;
            }
            if(i*i>n)
            {
                System.out.println("False");
                break;
            }
        }
        
    }
}