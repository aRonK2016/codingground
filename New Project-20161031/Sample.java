import java.io.*;
import java.util.Scanner;

public class Sample{

	public static int Add(int v1, int v2)

	{    
		int y = v1 + v2;
		return y;
	}

		 

	public static void main(String []args)
	{
		 int i = 1;			
		System.out.println("Please enter number (0 - 10) : ");
		 try {
		int k = System.in.read();
		
		System.out.print("Your entered number is : ");
        System.out.println(k);
		
		
		k=k+1;
		
		 if (k  >= 0 && k <= 10)
		  {
			  k=Add(k,i);
			  
		  }else{
			  
			  System.out.println("Invalid number");
				return;
		  }
		 System.out.println("The result of k is : "+k);
		 System.out.println("Now value of i is : "+i);
		 
		 int[] arr = new int[k];
		while (i <= k)
		{
			arr[i-1] = i;
			i=i+1;
			System.out.println("Now value of i is : "+i);
		}
		System.out.println();
		
		for (int number : arr)
		{
			System.out.println("arr["+i+"]");
			
		}
	
		Multi multi1 = new Multi();
		int m = multi1.Multifun(k,i);
		
		System.out.println("Now multipied value of k, i is : " + m);
		
		Scanner scn = new Scanner(System.in);
		String s = scn.next();
		CreateFile createfile1 = new CreateFile();
		createfile1.CreateFileTxt(s);
		return;
			 }catch(IOException e){
            System.out.println("Error reading from user");
			return;
        }
	}

}
