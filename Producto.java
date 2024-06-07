package SQDeportes;

//Clase Producto implementa encapsulamiento y correcta utilización de sintaxis y tipos de datos
public class Producto {

	private int idProducto;
    private int idProveedor;
    private String detalle;
    private String categoria;
    private double precio;
    private int cantidad;
    
    // Constructor para inicializar objetos
	public Producto(int idProducto, int idProveedor, String detalle, String categoria, double precio, int cantidad) {
		super();
		this.idProducto = idProducto;
		this.idProveedor = idProveedor;
		this.detalle = detalle;
		this.categoria = categoria;
		this.precio = precio;
		this.cantidad = cantidad;
	}
    
	// Métodos de l a clase Producto
	
    public void altaProducto() {
        // Código para alta de producto
    }

    public void bajaProducto() {
        // Código para baja de producto
    }

    public void modificarProducto() {
        // Código para modificar producto
    }

    public void visualizarProducto() {
        // Código para visualizar producto
    }

    public void listarProductos() {
        // Código para listar productos
    }

    public void consultarStockProducto() {
        // Código para consultar stock de producto
    }

    // Getters y Setters para encapsulamiento

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(int idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

    
}
