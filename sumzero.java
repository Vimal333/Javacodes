import java.util.Scanner;
public class sumzero {

	public static void main(String[] args) 
{
Scanner sc = new Scanner(System.in);
int[] a = new int[10];
int[][] b = new int[10][10];
int sz,x=0,y=0;
System.out.println("Enter how many numbers : ");
int n = sc.nextInt();
System.out.println("Enter numbers one by one ");
for(int i=0;i<n;i++)
{
 a[i] = sc.nextInt();
}
for(int i=0;i<n;i++)
{
for(int j=1;j<n-i;j++)
{
	b[i][j-1]=Math.abs(a[i]+a[j+i]);	
}
}
sz = b[0][0];		
for(int i=0;i<n;i++)
{
for(int j=0;j<n-i-1;j++)
{
	if(sz>b[i][j])
	{
		sz = b[i][j];
	}
} 
}
for(int i=0;i<n;i++)
{
for(int j=1;j<n-i;j++)
{
if(sz==Math.abs((a[i]+a[j+i])))
{	
	System.out.println("Possible numbers close to zero by adding :");
	System.out.println(a[i]);
	System.out.println(a[j+i]);
}
}
}
}
}
