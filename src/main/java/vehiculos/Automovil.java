package vehiculos;

public class Automovil extends Vehiculo {
	private int puestos;
	Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos){
		super(placa, nombre, "FWD", 4, 100, precio, peso, fabricante);
		//placa,nombre,traccion,puertas,velocidadMaxima,precio,peso,fabricante
		this.puestos=puestos;
		cantAuto++;
	}
	
	public int getPuestos() {
		return puestos;
	}
	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
}
