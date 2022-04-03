package Program;

import java.util.ArrayList;
import java.util.Scanner;

public class Digital2 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		int i, j, len, maxm = Integer.MIN_VALUE;
		
		String s;
		
		s = sc.nextLine();
		
		String str[] = s.split(" ");
		len = str.length;
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		
		for(i = 0; i < len; i++)
		{
			int count = 0;
			int length  = str[i].length();
			for(j = 0; j < length; j++)
			{
				char ch = str[i].charAt(j);
				
				if(ch >= '0' && ch<= '9')
					count+= 1;
				else
					break;
			}
			if(count == length)
				arr.add(Integer.parseInt(str[i]));
		}
		for(i = 0; i < arr.size(); i++)
			System.out.println(arr.get(i));
		for(i = 0; i < arr.size(); i++)
		{
			maxm = max(maxm, arr.get(i));
		}
		System.out.println(maxm);
	}
	static int max(int a, int b)
	{
		if(a > b)
			return a;
		return b;
	}
}
