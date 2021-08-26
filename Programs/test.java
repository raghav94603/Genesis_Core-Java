

	
	import java.util.*;
	public class test {
		
		public static void main(String[] arg)
		{
			
			Scanner s=new Scanner(System.in);
			
			TreeSet<String> set = new TreeSet<String>();
			int n;
			n=Integer.parseInt(s.nextLine());
			String str;
			for(int i=0;i<n;i++)
			{
				str=s.nextLine();
				set.add(str);
			}
			
				System.out.println(set);
			
	}
	}


