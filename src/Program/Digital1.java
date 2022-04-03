package Program;

import java.util.Scanner;

public class Digital1 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int start, end, i, d, count =0, num;
		start = sc.nextInt();
		end = sc.nextInt();
		
		for(i = start; i <= end; i++)
		{
			num = i;
			boolean visited[] = new boolean[]{false,false,false,false,false,false,false,false,false,false};
			if(i == 0)
				count+= 1;
			while(num > 0)
			{
				d = num % 10;
				if(visited[d] == true)
					break;
				else
				{
					visited[d] = true;
					num = num/10;
				}
			}
			if(num == 0 && i != 0)
				count+= 1;
				
		}
		System.out.print("  "+count);
		sc.close();
	}

}
