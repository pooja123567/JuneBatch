package WebsiteAutomation.WebsiteAutomation;

public class Infosys {

	public static void main(String[] args) {
		int a[]= {4, 5, 6, 7, 4, 5, 8, 9, 6,4};
		boolean b[]=new boolean[a.length];
		for(int i=0;i<a.length;i++)
		{
			if(b[i])
			{
				continue;
			}
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
					b[j]=true;
				}
			}
			
		}

	}

}
