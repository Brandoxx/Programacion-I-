import misClases.*;
import javax.swing.JOptionPane;


class Main {
	public static void main(String[] args) {
		
		double numero = Double.parseDouble(JOptionPane.showInputDialog("Digite un numero"));
		ConvertidorDeUnidades calculadora= new ConvertidorDeUnidades(numero);
		
		JOptionPane.showMessageDialog(null,calculadora.gramosAKilogramos(),"Calculadora",JOptionPane.INFORMATION_MESSAGE);
		JOptionPane.showMessageDialog(null,calculadora.kilogramosAGramos(),"Calculadora",JOptionPane.INFORMATION_MESSAGE);
		
	}
}