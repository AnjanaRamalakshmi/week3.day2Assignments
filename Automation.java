package week3.day2.Assignment;

public class Automation extends MultipleLanguage
{
	public void java()
	{
		System.out.println("java method");
	}

	public void selenium()
	{
		System.out.println("selenium method");
	}

	@Override
	public void ruby() 
	{
		System.out.println("ruby method");
		
	}

	public static void main(String[] args)
	{
		Automation automation = new Automation();
		automation.java();
		automation.python();
		automation.ruby();
		automation.selenium();

	}

	
}
