import java.util.Scanner;
class vowelorcon
{
	public static void main(String args[])
	{
		System.out.println("enter any letter from A to Z");
		Scanner letter = new Scanner(System.in);
		char x =letter.next().charAt(0);
		if(x>='A'&&x<='Z'||x>='a'&&x<'z')
		{
			if(x=='A'||x=='E'||x=='I'||x=='O'||x=='U'||x=='a'||x=='e'||x=='i'||x=='o'||x=='u')
			{
				System.out.println("vowel");
			}
			else
				System.out.println("consonent");
		}
		else
			System.out.println("error required alphabet not entered");

	}
}