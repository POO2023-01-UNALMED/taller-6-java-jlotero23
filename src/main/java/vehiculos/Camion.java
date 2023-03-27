package vehiculos;

public class Camion extends Vehiculo {
	private int ejes;
	
	Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes){
		super(placa, nombre, "4X2", 2, 80, precio, peso, fabricante);
		//placa,nombre,traccion,puertas,velocidadMaxima,precio,peso,fabricante
		this.ejes=ejes;
		
	}
	public int getEjes() {
		return ejes;
	}
	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
}
