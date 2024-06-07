package SQDeportes;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


//La clase Cliente hereda de Personas, aplicando herencia
public class Cliente extends Personas {

	//Atributos
	private int idCliente;
	private String DNI;
	private double cuentaCorriente;
	private static ArrayList<Cliente> clientes = new ArrayList<>(); //se crea un array para agregar borrar modificar clientes

	// Constructor para inicializar objetos, teniendo en cuenta los atributos de la superclase
	public Cliente(int idPersonas, String nombre, String direccion, String telefono, String localidad, String provincia,
			int idCliente, String dNI, double cuentaCorriente) {
		super(idPersonas, nombre, direccion, telefono, localidad, provincia);
		this.idCliente = idCliente;
		DNI = dNI;
		this.cuentaCorriente = cuentaCorriente;
	}


	// Métodos de la clase Cliente

	// Método para dar de alta un cliente con manejo de excepciones
	public static void altaCliente() {
		Scanner scanner = new Scanner(System.in);
		try { //bloque de excepciones
			System.out.println("**************************************************");
			System.out.println(" Ingrese el nombre del cliente:");
			String nombre = scanner.nextLine();
			System.out.println(" Ingrese el DNI del cliente:");
			String DNI = scanner.nextLine();
			System.out.println(" Ingrese la direccion del cliente:");
			String direccion = scanner.nextLine();
			System.out.println(" Ingrese el telefono del cliente:");
			String telefono = scanner.nextLine();
			System.out.println(" Ingrese la localidad del cliente:");
			String localidad = scanner.nextLine();
			System.out.println(" Ingrese la provincia del cliente:");
			String provincia = scanner.nextLine();
			System.out.println(" Ingrese la cuenta corriente del cliente:");
			double cuentaCorriente = scanner.nextDouble();

			Cliente nuevoCliente = new Cliente(clientes.size(), nombre, direccion, telefono, localidad, provincia, clientes.size(), DNI, cuentaCorriente);
			clientes.add(nuevoCliente); //agrega el cliente al array
			System.out.println("**************************************************");
			System.out.println(" Cliente dado de alta correctamente.");
			System.out.println("**************************************************");
		} catch (InputMismatchException e) {
			System.out.println("**************************************************");
			System.out.println("Error: Entrada invalida. Por favor, ingrese los datos correctamente.");
			System.out.println("**************************************************");
			scanner.nextLine(); // Limpiar el buffer del scanner
		}
	}

	// Método para dar de baja un cliente con manejo de excepciones
	public static void bajaCliente() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("**************************************************");
			System.out.println(" Ingrese el ID del cliente que desea dar de baja:");
			System.out.println(" Tenga en cuenta que el ID inicia en 0");
			System.out.println("**************************************************");
			int idClienteBaja = scanner.nextInt();

			boolean encontrado = false;
			for (int i = 0; i < clientes.size(); i++) { //estructura repetitiva for
				Cliente cliente = clientes.get(i);
				if (cliente.getIdCliente() == idClienteBaja) { //Estructura condicional if
					clientes.remove(i); // Eliminando el cliente del array
					encontrado = true;
					System.out.println("**************************************************");
					System.out.println(" Cliente dado de baja correctamente.");
					System.out.println("**************************************************");
					break;
				}
			}

			if (!encontrado) { //estructura condicional caso q no se encuentre
				System.out.println("**************************************************");
				System.out.println("Cliente no encontrado.");
			}
		} catch (InputMismatchException e) {
			System.out.println("**************************************************");
			System.out.println("Error: Entrada invalida. Por favor, ingrese un ID válido.");
			System.out.println("**************************************************");
			scanner.nextLine(); // Limpiar el buffer del scanner
		}
	}

	// Método para modificar un cliente con manejo de excepciones
	public static void modificarCliente() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("**************************************************");
			System.out.println(" Ingrese el ID del cliente que desea modificar:");
			System.out.println(" Tenga en cuenta que el ID inicia en 0");
			System.out.println("**************************************************");
			int idClienteModificar = scanner.nextInt();

			boolean encontrado = false;
			for (Cliente cliente : clientes) {
				if (cliente.getIdCliente() == idClienteModificar) {
					System.out.println("Ingrese el nuevo nombre del cliente:");
					scanner.nextLine(); // Consumir el salto de línea pendiente
					String nombre = scanner.nextLine();
					cliente.setNombre(nombre);

					System.out.println("Ingrese el nuevo DNI del cliente:");
					String dni = scanner.nextLine();
					cliente.setDNI(dni);

					System.out.println("Ingrese la nueva direccion del cliente:");
					String direccion = scanner.nextLine();
					cliente.setDireccion(direccion);

					System.out.println("Ingrese el nuevo telefono del cliente:");
					String telefono = scanner.nextLine();
					cliente.setTelefono(telefono);

					System.out.println("Ingrese la nueva localidad del cliente:");
					String localidad = scanner.nextLine();
					cliente.setLocalidad(localidad);

					System.out.println("Ingrese la nueva provincia del cliente:");
					String provincia = scanner.nextLine();
					cliente.setProvincia(provincia);

					System.out.println("Ingrese la nueva cuenta corriente del cliente:");
					double cuentaCorriente = scanner.nextDouble();
					cliente.setCuentaCorriente(cuentaCorriente);

					encontrado = true;
					System.out.println("**************************************************");
					System.out.println(" Cliente modificado correctamente.");
					System.out.println("**************************************************");
					break;
				}
			}

			if (!encontrado) {
				System.out.println("**************************************************");
				System.out.println("Cliente no encontrado.");
			}
		} catch (InputMismatchException e) {
			System.out.println("**************************************************");
			System.out.println("Error: Entrada invalida. Por favor, ingrese los datos correctamente.");
			System.out.println("**************************************************");
			scanner.nextLine(); // Limpiar el buffer del scanner
		}
	}

	// Método para visualizar un cliente con manejo de excepciones
	public static void visualizarCliente() {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.println("**************************************************");
			System.out.println(" Ingrese el ID del cliente que desea visualizar:");
			System.out.println(" Tenga en cuenta que el ID inicia en 0");
			System.out.println("**************************************************");
			int idClienteVisualizar = scanner.nextInt();

			boolean encontrado = false;
			for (Cliente cliente : clientes) {
				if (cliente.getIdCliente() == idClienteVisualizar) {
					System.out.println("Detalles del cliente:");
					System.out.println("ID: " + cliente.getIdCliente());
					System.out.println("Nombre: " + cliente.getNombre());
					System.out.println("DNI: " + cliente.getDNI());
					System.out.println("Direccion: " + cliente.getDireccion());
					System.out.println("Telefono: " + cliente.getTelefono());
					System.out.println("Localidad: " + cliente.getLocalidad());
					System.out.println("Provincia: " + cliente.getProvincia());
					System.out.println("Cuenta Corriente: " + cliente.getCuentaCorriente());
					encontrado = true;
					break;
				}
			}

			if (!encontrado) {
				System.out.println("**************************************************");
				System.out.println("Cliente no encontrado.");
			}
		} catch (InputMismatchException e) {
			System.out.println("**************************************************");
			System.out.println("Error: Entrada invalida. Por favor, ingrese un ID válido.");
			System.out.println("**************************************************");
			scanner.nextLine(); // Limpiar el buffer del scanner
		}
	}

	// Método para listar todos los clientes
	public static void listarClientes() {
		System.out.println("**************************************************");
		System.out.println("Listado de clientes:");
		System.out.println("**************************************************");
		if (clientes.isEmpty()) {
			System.out.println("No hay clientes registrados.");
		} else {
			for (Cliente cliente : clientes) {
				System.out.println("ID: " + cliente.getIdCliente());
				System.out.println("Nombre: " + cliente.getNombre());
				System.out.println("DNI: " + cliente.getDNI());
				System.out.println("Dirección: " + cliente.getDireccion());
				System.out.println("Teléfono: " + cliente.getTelefono());
				System.out.println("Localidad: " + cliente.getLocalidad());
				System.out.println("Provincia: " + cliente.getProvincia());
				System.out.println("Cuenta Corriente: " + cliente.getCuentaCorriente());
				System.out.println("--------------------------------------");
			}
		}
	}

	// Método para buscar clientes por nombre
	public static void buscarClientePorNombre() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("**************************************************");
		System.out.println("Ingrese el nombre del cliente que desea buscar:");
		System.out.println("**************************************************");
		String nombreBusqueda = scanner.nextLine();

		boolean encontrado = false;
		for (Cliente cliente : clientes) {
			if (cliente.getNombre().equalsIgnoreCase(nombreBusqueda)) {
				System.out.println("Detalles del cliente encontrado:");
				System.out.println("ID: " + cliente.getIdCliente());
				System.out.println("Nombre: " + cliente.getNombre());
				System.out.println("DNI: " + cliente.getDNI());
				System.out.println("Direccion: " + cliente.getDireccion());
				System.out.println("Telefono: " + cliente.getTelefono());
				System.out.println("Localidad: " + cliente.getLocalidad());
				System.out.println("Provincia: " + cliente.getProvincia());
				System.out.println("Cuenta Corriente: " + cliente.getCuentaCorriente());
				encontrado = true;
				break;
			}
		}

		if (!encontrado) {
			System.out.println("**************************************************");
			System.out.println("Cliente no encontrado.");
		}
	}

	// Getters y Setters para encapsulamiento

	public int getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}


	public String getDNI() {
		return DNI;
	}


	public void setDNI(String dNI) {
		DNI = dNI;
	}


	public double getCuentaCorriente() {
		return cuentaCorriente;
	}


	public void setCuentaCorriente(double cuentaCorriente) {
		this.cuentaCorriente = cuentaCorriente;
	}

}
