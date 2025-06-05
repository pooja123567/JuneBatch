package WebsiteAutomation.WebsiteAutomation;

public class Patternpgm {

	public static void main(String[] args) {
		for(int i=4;i>0;i--) 
		{
		for(int j=1;j<=4;j++)
			{
				if(i!=j)
				{
				System.out.print(j+" ");
				}
				else
				{
					System.out.print("* ");
				}
			}
			System.out.println();
		}

	}

}
