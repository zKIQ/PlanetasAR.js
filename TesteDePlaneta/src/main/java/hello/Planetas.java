package hello;

public class Planetas {
	private String LerMarte;
	private String LerTerra;
	private String LerNetuno;
	
	
	public Planetas(String LerMarte,String LerTerra,String LerNetuno){
		this.LerMarte = LerMarte;
		this.LerTerra = LerTerra;
		this.LerNetuno = LerNetuno;
	}
	
	public String getLerNetuno(){
		return this.LerNetuno;
	}
	
	public String getLerTerra(){
		return this.LerTerra;
	}
	
	public String getLerMarte(){
		return this.LerMarte;
	}
}
