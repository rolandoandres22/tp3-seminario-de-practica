package SQDeportes;

//La clase Empleado hereda de Personas, aplicando herencia
public class Empleado extends Personas {

	private int idEmpleado;
    private String CUIL;
    private String rol;
    
    // Constructor para inicializar objetos, teniendo en cuenta los atributos de la superclase
	public Empleado(int idPersonas, String nombre, String direccion, String telefono, String localidad,
			String provincia, int idEmpleado, String cUIL, String rol) {
		super(idPersonas, nombre, direccion, telefono, localidad, provincia);
		this.idEmpleado = idEmpleado;
		CUIL = cUIL;
		this.rol = rol;
	}
    
	// Métodos de la clase Empleado
	
    public void altaEmpleado() {
        // Código para alta de empleado
    }

    public void bajaEmpleado() {
        // Código para baja de empleado
    }

    public void modificarEmpleado() {
        // Código para modificar empleado
    }

    public void visualizarEmpleado() {
        // Código para visualizar empleado
    }

    public void listarEmpleados() {
        // Código para listar empleados
    }

    // Getters y Setters para encapsulamiento
    
	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public String getCUIL() {
		return CUIL;
	}

	public void setCUIL(String cUIL) {
		CUIL = cUIL;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

    
}
