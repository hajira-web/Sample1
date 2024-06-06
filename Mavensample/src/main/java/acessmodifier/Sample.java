package acessmodifier;

public class Sample {
	
	public void sampledisplay()
	{
		System.out.println("public display");
	}
	private void sampledisplay1()
	{
		System.out.println("private display");
	}
	protected void sampledisplay2()
	{
		System.out.println("protected display");
	}
	void sampledisplay3()
	{
		System.out.println("default display");
	}

	public static void main(String[] args) {
		
		Sample a=new Sample();
		a.sampledisplay();
		a.sampledisplay1();
		a.sampledisplay2();
		a.sampledisplay3();


	}

}
