package SQDeportes;

//La clase Proveedor hereda de Personas, aplicando herencia
public class Proveedor extends Personas {

	private int idProveedor;
    private String CUIT;
    
    // Constructor para inicializar objetos, teniendo en cuenta los atributos de la superclase
	public Proveedor(int idPersonas, String nombre, String direccion, String telefono, String localidad,
			String provincia, int idProveedor, String cUIT) {
		super(idPersonas, nombre, direccion, telefono, localidad, provincia);
		this.idProveedor = idProveedor;
		CUIT = cUIT;
	}
    
	// Métodos de la clase Proveedor
	
    public void altaProveedor() {
        // Código para alta de proveedor
    }

    public void bajaProveedor() {
        // Código para baja de proveedor
    }

    public void modificarProveedor() {
        // Código para modificar proveedor
    }

    public void visualizarProveedor() {
        // Código para visualizar proveedor
    }

    public void listarProveedores() {
        // Código para listar proveedores
    }

    // Getters y Setters para encapsulamiento
    
	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getCUIT() {
		return CUIT;
	}

	public void setCUIT(String cUIT) {
		CUIT = cUIT;
	}
    
    
}
