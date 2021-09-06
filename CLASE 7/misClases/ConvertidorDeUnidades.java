package misClases;

public class ConvertidorDeUnidades {

	private double numero;
	private double gramos;
	private double kilogramos;
	
	
	public ConvertidorDeUnidades(double numeroNuevo) {
		
		numero=numeroNuevo;
		
	}
	
	public void setNumero (double nuevoNumero) {
		
		numero=nuevoNumero;
	}
	
	public double getNumero() {
		
		return numero;
	}
	
	public String gramosAKilogramos () {
		
		kilogramos=numero/1000;
		
		return numero+" gramos es equivalente a "+kilogramos+" kilogramos";
	}
	
	public String kilogramosAGramos () {
		
		gramos=numero*1000;
		
		return numero+" kilogramos es equivalente a "+gramos+" gramos";
	}
}