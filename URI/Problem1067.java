import java.util.Scanner;
public class Problem1067
{
  public static void main (String[]args)
  {
    Scanner puttingvaluesinside=new Scanner (System.in);
    int a=puttingvaluesinside.nextInt();
    for(int c=1;c<=a;c+=2)
      System.out.println(c);
  }
}