package com.teachersdunet.javaintermediaire1;

import javax.swing.JOptionPane;

public class BoiteDialogueTest {

	public static void main(String[] args) {
		
		String nom =JOptionPane.showInputDialog("Quel est ton nom ?");
		
		String message = String.format("Bonjour %s. Java est cool, n'est-ce pas?", nom);
		//JOptionPane.showMessageDialog(null,"Bonjour "+nom);
		JOptionPane.showMessageDialog(null, message);

}
	}

	
