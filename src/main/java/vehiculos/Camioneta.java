package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	int cantCamioneta=0;
	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco){
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		//placa,puertas, velocidadMaxima, nombre, precio, peso,traccion, fabricante
		this.volco=volco;
		cantCamioneta++;
	}
	public boolean isVolco() {
		return volco;
	}
	public void setVolco(boolean volco) {
		this.volco = volco;
	}
}
