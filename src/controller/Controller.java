package controller;

public class Controller {
	
	public Controller() {
		super();
		}
	
	public int somaNaturais(int num) {
		
		//Condi��o de parada : Se o numero de entrada for igual ou menor que 0, dever� retornar 0
		if(num <= 0) {
			return 0;
		}else
		//Se o n�mero de entrada for maior que zero, ent�o ir� somar (n�mero entrada + (n�mero entrada - 1))  	
			return num + somaNaturais(num - 1);
	}

}
