package model;

public class Cliente {

	private int id;
	private String nombre;
	private String direccion;
	private String website;
	private double credito;
	
	public Cliente() {
		
	}
	
	public Cliente(int id, String nombre, String direccion, String website, double credito) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.website = website;
		this.credito = credito;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public double getCredito() {
		return credito;
	}

	public void setCredito(double credito) {
		this.credito = credito;
	}
	
	
}
