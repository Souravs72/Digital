package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class Primes 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i, j, start, end, count;
		start = sc.nextInt();
		end = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<>();
		for(i = start; i <= end; i++)
		{
			count = 0;
			if(i < 2)
				continue;
			for(j = 2; j <= i; j++)
			{
				if(i % j == 0)
					count+= 1;
			}
			if(count == 1)
				arr.add(i);
			
		}
		for(i = 0; i <arr.size(); i++)
			System.out.print(arr.get(i)+" ");
		System.out.println("");
		count = 0;
		int size = arr.size();
		for(i = 0; i < size - 1; i++)
		{
			for (j = i+1; j < size; j++)
			{
				if(arr.get(j) - arr.get(i) == 6)
				{
					count+= 1;
					break;
				}
			}
		}
		
		
		System.out.println(count);
	}
}
