package SQDeportes;

//La clase abstracta Personas implementa la abstracción y encapsulamiento
public abstract class Personas {

	//Atributos
	protected int idPersonas;
	protected String nombre;
	protected String direccion;
	protected String telefono;
	protected String localidad;
	protected String provincia;

    // Constructor para inicializar objetos
	protected Personas(int idPersonas, String nombre, String direccion, String telefono, String localidad,
			String provincia) {
		super();
		this.idPersonas = idPersonas;
		this.nombre = nombre;
		this.direccion = direccion;
		this.telefono = telefono;
		this.localidad = localidad;
		this.provincia = provincia;  
	}

    // Getters y Setters para encapsulamiento
	
	public int getIdPersonas() {
		return idPersonas;
	}

	public void setIdPersonas(int idPersonas) {
		this.idPersonas = idPersonas;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}


}
