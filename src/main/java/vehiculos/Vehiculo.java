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
		CantidadVehiculos+=1;
	}
	public static void setCantidadVehiculos(int cantidadVehiculos) {
		Vehiculo.CantidadVehiculos= cantidadVehiculos;
	}
	
	public static int getCantidadVehiculos() {
		return CantidadVehiculos;
	}
	
	public void setPlaca(String placa){
		this.placa=placa;
	}
	
	public String getPlaca(){
		return placa;
	}

	public void setPuertas(int puertas){
		this.puertas=puertas;
	}
	
	public int getPuertas(){
		return puertas;
	}

	public void setVelocidadMaxima(int velocidadMaxima){
		this.velocidadMaxima=velocidadMaxima;
	}
	
	public int getVelocidadMaxima(){
		return velocidadMaxima;
	}

	public void setnombre(String nombre){
		this.nombre=nombre;
	}

	public String getNombre(){
		return nombre;
	}

	public void setPrecio(int precio){
		this.precio=precio;
	}
	
	public int getPrecio(){
		return precio;
	}

	public void setPeso(int peso){
		this.peso=peso;
	}
	
	public int getPeso(){
		return peso;
	}

	public void setTraccion(String traccion){
		this.traccion=traccion;
	}

	public String getTraccion(){
		return traccion;
	}
	
	public void setFabricante(Fabricante fabricante){
		this.fabricante=fabricante;
	}

	public Fabricante getFabricante(){
		return fabricante;
	}
	
	public static String vehiculosPorTipo() {
		return "Automoviles: "+Automovil.CantidadAutomoviles+"/nCamionetas: "+Camioneta.CantidadCamionetas+"/nCamiones: "+Camion.CantidadCamiones;
	}
	
	public static Fabricante revisionFabricantes(){
	    int n=0;
	    Fabricante f=null;
	    for(Fabricante i:listaFabricantes){
	      int c=0;
	      for(Fabricante e:listaFabricantes){
	        if(i.getNombre()==e.getNombre()){
	          c+=1;
	        }
	      }
	      if (c>n){
	        n=c;
	        f=i;
	      }   
	    }
	    return f;
	  }
}
