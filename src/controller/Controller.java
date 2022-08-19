package controller;

public class Controller {
	
	public Controller() {
		super();
		}
	
	public int somaNaturais(int num) {
		
		//Condição de parada : Se o numero de entrada for igual ou menor que 0, deverá retornar 0
		if(num <= 0) {
			return 0;
		}else
		//Se o número de entrada for maior que zero, então irá somar (número entrada + (número entrada - 1))  	
			return num + somaNaturais(num - 1);
	}

}
