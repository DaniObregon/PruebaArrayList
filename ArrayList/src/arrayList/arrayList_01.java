package arrayList;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class arrayList_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> lista = new ArrayList<>();
		
		lista.add("ElChabon");
		
		lista.add(JOptionPane.showInputDialog("Introduce un nombre"));
		
		System.out.println("Elementos de la lista: " + lista.toString());

	}

}
