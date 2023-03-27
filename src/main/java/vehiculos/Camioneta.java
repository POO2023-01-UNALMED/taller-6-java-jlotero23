package vehiculos;

public class Camioneta extends Vehiculo {
	private boolean volco;
	Camioneta(String placa, String nombre, int puertas, int precio, int peso, Fabricante fabricante, boolean volco){
		super(placa, nombre, "4X4", puertas, 90, precio, peso, fabricante);
		//placa,nombre,traccion,puertas,velocidadMaxima,precio,peso,fabricante
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
