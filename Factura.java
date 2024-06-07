package SQDeportes;
import java.util.Date;

//Clase Factura implementa encapsulamiento y correcta utilización de sintaxis y tipos de datos
public class Factura {

	 private int idFactura;
	    private Date fechaFactura;
	    private int idCliente;
	    private int idProducto;
	    private int cantidadProducto;
	    private double valorUnitario;
	    private double valorTotal;
	    private double iva;
		
	    // Constructor para inicializar objetos
		public Factura(int idFactura, Date fechaFactura, int idCliente, int idProducto, int cantidadProducto,
				double valorUnitario, double valorTotal, double iva) {
			super();
			this.idFactura = idFactura;
			this.fechaFactura = fechaFactura;
			this.idCliente = idCliente;
			this.idProducto = idProducto;
			this.cantidadProducto = cantidadProducto;
			this.valorUnitario = valorUnitario;
			this.valorTotal = valorTotal;
			this.iva = iva;
		}
	   
		// Métodos de la clase Factura
	    public void generarFactura() {
	        // Código para generar factura
	    }

	    public void generarNotaCredito() {
	        // Código para generar nota de crédito
	    }

	    public void imprimir() {
	        // Código para imprimir factura
	    }

	    public void modificarFactura() {
	        // Código para modificar factura
	    }

	    // Getters y Setters para encapsulamiento

		public int getIdFactura() {
			return idFactura;
		}

		public void setIdFactura(int idFactura) {
			this.idFactura = idFactura;
		}

		public Date getFechaFactura() {
			return fechaFactura;
		}

		public void setFechaFactura(Date fechaFactura) {
			this.fechaFactura = fechaFactura;
		}

		public int getIdCliente() {
			return idCliente;
		}

		public void setIdCliente(int idCliente) {
			this.idCliente = idCliente;
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

		public double getValorUnitario() {
			return valorUnitario;
		}

		public void setValorUnitario(double valorUnitario) {
			this.valorUnitario = valorUnitario;
		}

		public double getValorTotal() {
			return valorTotal;
		}

		public void setValorTotal(double valorTotal) {
			this.valorTotal = valorTotal;
		}

		public double getIva() {
			return iva;
		}

		public void setIva(double iva) {
			this.iva = iva;
		}
	    
	    
}
