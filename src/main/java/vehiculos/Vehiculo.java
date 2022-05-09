package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
	private String placa;
	private int puertas;
	private int velocidadMaxima;
	private String nombre;
	private int precio;
	private int peso;
	private String traccion;
	private Fabricante fabricante;
	private static int CantidadVehiculos;
	static ArrayList<Fabricante> listaFabricantes = new ArrayList<Fabricante>();

	public Vehiculo(String placa,int puertas, int velocidad, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.placa = placa;
		this.puertas=puertas;
		this.velocidadMaxima=velocidad;
		this.nombre = nombre;
		this.peso = peso;
		this.traccion=traccion;
		this.fabricante = fabricante;
		this.precio = precio;
		listaFabricantes.add(fabricante);
		CantidadVehiculos=+1;
	}
}