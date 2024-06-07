package SQDeportes;
import java.util.Date;

//Clase Pedido implementa encapsulamiento y correcta utilización de sintaxis y tipos de datos
public class Pedido {

	private int idPedido;
    private int idCliente;
    private int idEmpleado;
    private Date fecha;
    private int idProducto;
    private int cantidadProducto;
    
    // Constructor para inicializar objetos
	public Pedido(int idPedido, int idCliente, int idEmpleado, Date fecha, int idProducto, int cantidadProducto) {
		super();
		this.idPedido = idPedido;
		this.idCliente = idCliente;
		this.idEmpleado = idEmpleado;
		this.fecha = fecha;
		this.idProducto = idProducto;
		this.cantidadProducto = cantidadProducto;
	}
    
	// Métodos de la clase Pedidos
    public void altaPedido() {
        // Código para alta de pedido
    }

    public void bajaPedido() {
        // Código para baja de pedido
    }

    public void modificarPedido() {
        // Código para modificar pedido
    }

    public void visualizarPedido() {
        // Código para visualizar pedido
    }

    public void generarPagoPedido() {
        // Código para generar pago de pedido
    }

    public void descontarStock() {
        // Código para descontar stock de producto
    }

    // Getters y Setters para encapsulamiento

	public int getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public int getIdEmpleado() {
		return idEmpleado;
	}

	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

    
}
