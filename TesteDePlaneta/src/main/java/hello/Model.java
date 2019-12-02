/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Model {

	private List<Planetas> planeta = new LinkedList<Planetas>();
	
	public void addPlanetas(Planetas planetas){
		planeta.add(planetas);
	}
	public List<Planetas> getPlanetas(){
		return planeta;
	}
}
