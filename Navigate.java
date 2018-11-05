import java.util.Random;
import java.util.Scanner;
public class Navigate {
	
public static long startTime = System.currentTimeMillis();
public static int count=0;
public static void main(String[] args) {
		
	    System.out.println("Enter the dimension of the room;");
		int nx;
		Scanner s=new Scanner(System.in);
		nx=s.nextInt();
		if(nx<0)
			System.exit(0);
		int a[][]= new int[nx][nx];
	    System.out.println("Enter the starting position of scanning");
	    Scanner p=new Scanner(System.in);
	    int st1=p.nextInt();
	    Scanner q=new Scanner(System.in);
	    int st2=q.nextInt();
	    int ran=RandInt(st1, st2);
	    System.out.println("The number generated is " + ran);
	    int obs[][]= RandInt2( ran);
	    
	    Calculate(obs, a, nx, st1, st2);
	    
	    long sndTime= System.currentTimeMillis();
	    System.out.println("Execution time" + (sndTime-startTime));
	    
	    }
	private static int RandInt(int st1, int st2) {
		
		Random rand = new Random();
		int randomnum= rand.nextInt(st2-st1+10);
		return randomnum;
	}
	 
	private static int[][] RandInt2(int r1)
	{
		System.out.println("Enter the coordinates where the obstacles are present");
		int st[][]= new int[r1][2];
		for(int i=0; i<r1; i++)
		{
		     for(int j=0; j<2; j++)
		     {
		    	 Scanner sc= new Scanner(System.in);
		    	 st[i][j]= sc.nextInt();
		     }
		}
		
		return st;
		
	}
	    
	public static void Calculate(int xr[][], int original[][], int n1, int p1, int p2)
	{
		int i=0, j=0;
	    do{
	    	     if (p1==xr[i][j] && p2==xr[i][j+1])
	    	    	{
	    	    	 count++;
	    	    	}
	    	     i++;
	    	     p1++;
	    	     p2++;
	    }while(i==n1);
	    	    	 
	    System.out.println("The number of obstacles in the room is" + " " + count + " " );  	 
	    	    	 
	    }
	}
	    
	    
		
		
		
		

	


