package example;
class Studentz
{
	private String name;
	
	private String email;
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
}

public class getsetmethod 
{

	public static void main(String[] args)
	{
		Studentz s = new Studentz();
		s.setName("taj");
		System.out.println(s.getName());
		
		s.setEmail("taj@gamial.com");
		System.out.println(s.getEmail());

	}

}


