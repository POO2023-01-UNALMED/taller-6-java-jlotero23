package vehiculos;
import java.util.ArrayList;

public class Pais {
	private String nombre;
	public Pais(String nombre){
		this.nombre=nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public static Pais paisMasVendedor() {
		ArrayList<Pais> paises = new ArrayList<Pais>();
		for (Fabricante fabricante : Fabricante.fabricantes) {
			paises.add(fabricante.getPais());
			}
		int mayor = 0;
		Pais masVendedor = null;
		for (Pais pais : paises) {
			int cont = 0;
			for (int i = 0; i < paises.size(); i++) {
				if (pais == paises.get(i)){
					cont++;
					}
				}
			if (cont > mayor){
				mayor = cont;
				masVendedor = pais;
				}
			}
		return masVendedor;
		}
	}
