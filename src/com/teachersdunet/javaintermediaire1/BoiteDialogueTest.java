package com.teachersdunet.javaintermediaire1;

import javax.swing.JOptionPane;

public class BoiteDialogueTest {

	public static void main(String[] args) {
		
		String nom =JOptionPane.showInputDialog("Quel est ton nom ?");
		
		JOptionPane.showMessageDialog(null,"Bonjour "+nom);
	}

}
