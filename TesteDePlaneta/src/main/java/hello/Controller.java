package hello;

import static spark.Spark.get;

import java.util.List;


public class Controller {
	
	private Model model;
	
	
	public Controller(Model model){
		this.model = model;
	}
	
	public void ControlPlaneta(){
		get("/planeta/:LerMarte/:LetNetuno/:LerTerra", (req, res) -> {
			return "planeta";
			
		});
	}
	
}
