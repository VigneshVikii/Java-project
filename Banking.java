package dailytask;
import java.util.Scanner;

public class Banking {
			public static void main(String[] args) {
				Scanner input1=new Scanner(System.in);
				SBI a = new SBI();
				HDFC b = new HDFC();
				AXIS c = new AXIS();
				ICICI d =new ICICI();
				System.out.println("* Choose Your BANKING Sector Choice *");
				System.out.println(" 1. For SBI ");
				System.out.println(" 2. For HDFC ");
				System.out.println(" 3. For AXIS ");
				System.out.println(" 4. For ICICI ");
				int choice=input1.nextInt();
				switch(choice)
				{
				case 1:
					a.intrest();
					break;
				case 2:
					b.intrest();
					break;
				case 3:
					c.intrest();
					break;
				case 4:
					d.intrest();
					break;
				default :
					System.out.println("You Have Enterd Wrong Choice");
					
				}

			}
}
class SBI extends Banking 
{
	public static void intrest()
	{
		Scanner input=new Scanner(System.in);
		System.out.println("*** Welcome To SBI ***");
		System.out.println("Enter * YOUR PRINCIPLE AMOUNT * Eg :: 10000");
		int P=input.nextInt();
		System.out.println("ENTER YOUR *YEAR* Eg:: 1 ");
		int T=input.nextInt();
		double R=6.8;
		double IR;
		IR =(P*R*T)/100;
		System.out.println(" SBI RATE OF INTREST AMMOUNT IS :" + IR);
	}
}
class HDFC extends Banking
{
	public static void intrest()
	{
	Scanner input=new Scanner(System.in);
	System.out.println("*** Welcome To HDFC ***");
	System.out.println("Enter * YOUR PRINCIPLE AMOUNT * Eg :: 10000");
	int P=input.nextInt();
	System.out.println("ENTER YOUR *YEAR* Eg:: 1 ");
	int T=input.nextInt();
	double R=6.6;
	double IR;
	IR =(P*R*T)/100;
	System.out.println(" HDFC RATE OF INTREST AMMOUNT IS :" + IR);
}
}
class AXIS extends Banking
{
	public static void intrest()
	{
	Scanner input=new Scanner(System.in);
	System.out.println("*** Welcome To AXIS ***");
	System.out.println("Enter * YOUR PRINCIPLE AMOUNT * Eg :: 10000");
	int P=input.nextInt();
	System.out.println("ENTER YOUR *YEAR* Eg:: 1 ");
	int T=input.nextInt();
	double R=6.75;
	double IR;
	IR =(P*R*T)/100;
	System.out.println(" AXIS RATE OF INTREST AMMOUNT IS :" + IR);
	}
	}
class ICICI extends Banking
{
	public static void intrest()
	{
	Scanner input=new Scanner(System.in);
	System.out.println("*** Welcome To ICICI ***");
	System.out.println("Enter * YOUR PRINCIPLE AMOUNT * Eg :: 10000");
	int P=input.nextInt();
	System.out.println("ENTER YOUR *YEAR* Eg:: 1 ");
	int T=input.nextInt();
	double R=6.7;
	double IR;
	IR =(P*R*T)/100;
	System.out.println(" ICICI RATE OF INTREST AMMOUNT IS :" + IR);
	}
	}