package Program;

import java.util.LinkedHashSet;
import java.util.*;

public class Checking 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str = "GeeksForGeeks", str1 = "d", str2;
		char ch = 'k';
		str2 = String.valueOf(ch);
		
		String arr[] = new String[10];
		int i, j= 0;
		
		for(i =0; i < arr.length; i++)
        {
			arr[i] = sc.next();
        }
		LinkedHashSet<Character> sets = new LinkedHashSet<>();
        
        
        for(i =0; i < arr.length; i++)
        {
            for(j = 0; j < arr[i].length(); j++)
            {
            	sets.add((char)arr[i].charAt(j));
            }
        }
        List<Character> arrs = new ArrayList<>(sets);
		if(str.contains(str1))
			System.out.println("True");
		else
			System.out.println("False");
		if(str.contains(str2))
			System.out.println("True");
		else
			System.out.println("False");
	}
}
