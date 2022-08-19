package view;

import controller.Controller;

import javax.swing.JOptionPane;


public class Principal {
	

	public static void main(String[] args) {
		
//		Metodo construtor
		Controller controller = new Controller();
		
//		variavel que recebe e guarda o um n�mero para soma
		int numNat = Integer.parseInt(JOptionPane.showInputDialog("Informe um n�mero natural: "));
		
//		Valida��o para entrada de n�meros negativos
		if(numNat < 0) {
			JOptionPane.showMessageDialog(null,
				    "Informe um n�mero natural positivo.",
				    "Inane error",
				    JOptionPane.ERROR_MESSAGE);
		}
		
//		variavel que recebe e mostra o resultado
		int somaNaturais = controller.somaNaturais(numNat);
		System.out.println("Soma do n�mero informado: "+somaNaturais);
	}

	}


