package Ejercicio1;

public class Coche extends Vehiculo{
	private int numPuertas;
	private String tipoCombustible;
	
	public Coche(String marca, String modelo, int anio, int precioBase, int numPuertas, String tipoCombustible) {
	    super(marca, modelo, anio, precioBase);
	    this.numPuertas = numPuertas;
	    this.tipoCombustible = tipoCombustible;
	}

	public int getNumPuertas() {return numPuertas;}

	public void setNumPuertas(int numPuertas) {	this.numPuertas = numPuertas;}

	public String getTipoCombustible() {return tipoCombustible;}

	public void setTipoCombustible(String tipoCombustible) {this.tipoCombustible = tipoCombustible;}
	
	@Override
    public void mostrar_info() {
        super.mostrar_info();
        System.out.println("Número de puertas: " + numPuertas +
                           "\nTipo de combustible: " + tipoCombustible);
    }
	
	
	
}