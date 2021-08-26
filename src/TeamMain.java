import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class TeamMain {

	public static void main(String[] arg)
	{
		
		Scanner s=new Scanner(System.in);
		
		ArrayList<String> l = new ArrayList<>();
		int n;
		n=Integer.parseInt(s.nextLine());
		String str;
		for(int i=0;i<n;i++)
		{
			str=s.nextLine();
			l.add(str);
		}
		
		System.out.println(l);
		
	}
	
	
}
