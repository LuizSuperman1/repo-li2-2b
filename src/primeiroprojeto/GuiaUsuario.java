package primeiroprojeto;

import javax.swing.JOptionPane;

public class GuiaUsuario {

	public static void main(String[] args) {
		int rm = 82497;
		String nome = "Luiz";
		String username = nome + "_" + rm;
		
		JOptionPane.showMessageDialog(null, 
				"RM: " + rm + "\n" +
				"Nome: " + nome + "\n" +
				"Usuário: " + username );

	}

}
