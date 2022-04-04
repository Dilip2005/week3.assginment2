package week3.ass.assignment;

public class Automation extends MulitipleLanguage implements Lanaguage,LangTestTool{

	public void ruby() {
		System.out.println("i learn ruby");
	}
	public void python()
	{
		System.out.println("i learn python");
		
	}
	
	public void java() {
		System.out.println("i learn java");
		
	}
	
	public void selenium() {
		System.out.println("i learn selenium");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Automation aut= new Automation();
aut.java();
aut.selenium();
aut.python();
aut.ruby();
}

}
