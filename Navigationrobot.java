import java.util.Random;
import java.util.Scanner;
public class Navigationrobot {
	public static long startTime = System.currentTimeMillis();
	public static int count=0, l=0, k=0;
	public static void main(String[] args) {
		
	int n;
	System.out.println("Enter the dimensions of the room in even number and greater than 2");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	boolean room[][]= new boolean[n][n];
	
	Random rand = new Random();
	int randomnumber = rand.nextInt(n/2) + 2;
	System.out.println("Random number generated is:" + randomnumber);
	int obs[] = RandInt(randomnumber);
	int obs1[]= RandInt(randomnumber);
	
	Calculate (room, obs, obs1, n);
	
	long sndTime = System.currentTimeMillis();
	System.out.println("Execution time" + " " + (sndTime-startTime));

	}
 
	public static int[] RandInt(int random)
	{
		int b[]=new int[random];
		
		for(int i=0; i<random; i++ )
		{
			
			Random rand2= new Random();
			int randomnumber2= rand2.nextInt(random+1);
			b[i]= randomnumber2;
			
		}
		return b;
	}
	
	public static void Calculate(boolean room1[][], int obs[], int obs1[], int n1)
	{
		for(int i=0; i<n1; i++)
		{
			for(int j=0; j<n1; j++)
			{
				if(i==obs[k] && j==obs1[l])
				{
					count++;
					System.out.println("x coordinate = " + " " + obs[k]+ " " + "y coordinate =" + " " + obs1[l] );
					k++;
					l++;
					
				}
			}
			
			}
		System.out.println("The number of obstacles in the room is:" + count);
	}
	}


