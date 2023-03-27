package vehiculos;

public class Vehiculo {
	private String placa, nombre, traccion;
	private int puertas, velocidadMaxima, precio, peso;
	protected Fabricante fabricante;
	private int CantidadVehiculos=0;
	protected int cantAuto;
	protected int cantCam;
	protected int cantCamion;
	
	public Vehiculo(String placa, int puertas,  int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante){
		//placa,puertas, velocidadMaxima, nombre, precio, peso, traccion, fabricante
		this.setPlaca(placa);
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setPeso(peso);
		this.setFabricante(fabricante);
		this.setPuertas(puertas);
		this.setVelocidadMaxima(velocidadMaxima);
		this.setTraccion(traccion);
		cantidadVehiculos++;
		fabricante.numventas++;
	}
	public String vehiculoPorTipo(){
		return "Automoviles: " + cantAuto + "\nCamionetas: " + cantCam + "\nCamiones: " + cantCamion;
		
	}
	public String getTraccion() {
		return traccion;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCantidadVehiculos() {
		return cantidadVehiculos;
	}
	public void setCantidadVehiculos(int cantidadVehiculos) {
		this.cantidadVehiculos = cantidadVehiculos;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	
	

}
