package vehiculos;
import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	int numventas;
	ArrayList<Fabricante> fabricantes=new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais){
		this.nombre=nombre;
		this.pais=pais;
		fabricantes.add(this);
	}
	
	public Fabricante fabricaMayorVentas() {
		int masVentas=0;
		Fabricante masVendedor=null;
		for (Fabricante fabricante : fabricantes) {
			if (fabricante.numventas>=masVentas) {
				masVentas=fabricante.numventas;
				masVendedor=fabricante;
			}
		}
		
		return masVendedor;
	}
	
}
