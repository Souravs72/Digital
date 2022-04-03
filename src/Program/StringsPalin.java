package Program;

import java.util.*;

public class StringsPalin
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int len;
		String str,str1; 
		
		String st = "PWSDFS";
		
		int k = st.indexOf("S");
		System.out.println(k);
		str = sc.nextLine();
		char ch ='a';
		if(str.contains(String.valueOf(ch)))
		{
			
		}
		System.out.println(FindDuplicates(str));
		;
		sc.close();
	}
	static String FindDuplicates(String str)
	{
		int i , len;
		
		len= str.length();
		ArrayList<Character> arr = new ArrayList<>();
		for(i = 0; i < len; i++)
		{
			char ch = str.charAt(i);
			arr.add(ch);
		}
		Set<Character> hash = new LinkedHashSet<>(arr);
		ArrayList<Character> arr1 = new ArrayList<>(hash);
		
		StringBuilder builder = new StringBuilder();
		
		for(i = 0; i < arr1.size(); i++)
		{
			builder = builder.append(arr1.get(i));
			
		}
		return builder.toString();
	}
	static int max(int a, int b)
	{
		if(a > b)
			return a;
		else
			return b;
	}
}


