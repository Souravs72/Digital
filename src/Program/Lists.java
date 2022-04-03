package Program;

import java.util.*;

public class Lists 
{
	public static void main(String[] args) 
	{
//		Scanner sc = new Scanner(System.in);
//		int n;
//		n = sc.nextInt();
//		List<Integer> list = new ArrayList<>();
//		List<List<Integer>> lists = new ArrayList<>();
//		
//		lists = generate(n);
//		
//		for(int i = 0; i < n; i++)
//        {
//            for(int j = 0; j <= i; j++)
//            {
//            	System.out.println(lists.get(i).get(j));
//            }
//        }
		boolean visited[] = new boolean[]{false, false, false, false, false, false, false, false,false,false};
		for(int i = 0; i < 10; i++)
		{
			visited[i] = true;
		}
		for(int i = 0; i < 10; i++)
			System.out.println(visited[i]);
	}
//	static List<List<Integer>> generate(int numRows) 
//    {
//        int i, j;
//        List<Integer> list = new ArrayList<>();
//        List<List<Integer>> lists = new ArrayList<>();
//        list.add(1);
//        lists.add(list);
//        if(numRows == 1)
//            return lists;
//        System.out.println(lists.get(0).get(0));
//        for(i = 1; i < numRows; i++)
//        {
//            for(j = 0; j <= i; j++)
//            {
//            	
//                if(j == 0)
//                    list.add(1);
//                else if(j == i)
//                    list.add(1);
//                else
//                {
//                    int sum =0;
//                    while(j < i)
//                    {
//                        sum = lists.get(i - 1).get(j -1) + lists.get(i - 1).get(j);
//                    }
//                    list.add(sum);
//                    j++;
//                }
//                System.out.print(lists.get(i).get(j)+" ");
//            }
//            lists.add(list);
//            System.out.println("");
//        }
//        return lists;
//    }
}
