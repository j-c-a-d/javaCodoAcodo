package actividad_pooII;

import javax.swing.JOptionPane;

public class Datos_pooII {

	public static void main(String[] args) {
		String nombre,apellido,hovie,editorPref,so,edad;
		nombre=JOptionPane.showInputDialog("Ingrese su nombre:");
		apellido=JOptionPane.showInputDialog("Ingrese su Apellido:");
		hovie=JOptionPane.showInputDialog("Ingrese su hovie:");
		editorPref=JOptionPane.showInputDialog("Ingrese su editor de código preferido:");
		so=JOptionPane.showInputDialog("Ingrese su sistema operativo:");
		edad=JOptionPane.showInputDialog("Ingrese edad:");
		
		System.out.println("Nombre: "+nombre+"\n"+"Apellido: "+apellido+"\n"+"Edad: "+edad+"\n"+"Hovie: "+hovie+"\n"+"Editor de codigo: "+editorPref+"\n"+"Sistema operativo: "+so);
	}

}
