package SQDeportes;
import java.util.InputMismatchException;
import java.util.Scanner;

//Clase con menú de selección, demostrando empleo de estructuras condicionales y repetitivas
public class menuPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		boolean exit = false;

		while (!exit) { // Estructura repetitiva para el menú

			System.out.println("**************************************************");
			System.out.println(" Bienvenidos al Sistema de Gestion de SQDeportes:");
			System.out.println("**************************************************");
			System.out.println(" Por favor, Seleccione una opcion:");
			System.out.println("**************************************************");
			System.out.println(" 1. Gestion de Clientes");
			System.out.println(" 2. Gestion de Empleados");
			System.out.println(" 3. Gestion de Proveedores");
			System.out.println(" 4. Gestion de Productos");
			System.out.println(" 5. Gestion de Pedidos");
			System.out.println(" 6. Gestion de Facturas");
			System.out.println(" 0. Salir");
			System.out.println("**************************************************");

			try { //Bloque para captura de excepciones solo se pueden ingresar valores numericos al menu
				int option = scanner.nextInt();

				switch (option) { // Estructura de control condicional para manejar la selección del usuario
				case 1:
					// Gestión de Clientes
					gestionarClientes(scanner);
					break;
				case 2:
					// Gestión de Empleados
					gestionarEmpleados();
					break;
				case 3:
					// Gestión de Proveedores
					gestionarProveedores();
					break;
				case 4:
					// Gestión de Productos
					gestionarProductos();
					break;
				case 5:
					// Gestión de Pedidos
					gestionarPedidos();
					break;
				case 6:
					// Gestión de Facturas
					gestionarFacturas();
					break;
				case 0:
					exit = true;
					break;
				default:
					System.out.println("Opcion no valida. Intente nuevamente.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, ingrese una opcion numerica.");
				scanner.next(); 
			}
		}
	}

	// Menu para gestionar Clientes
	public static void gestionarClientes(Scanner scanner) {
		boolean back = false;

		while (!back) { // Estructura repetitiva para el menú

			System.out.println("**************************************************");
			System.out.println(" Gestion de Clientes:");
			System.out.println("**************************************************");
			System.out.println(" 1. Alta de Cliente");
			System.out.println(" 2. Baja de Cliente");
			System.out.println(" 3. Modificacion de Cliente");
			System.out.println(" 4. Visualizacion de Cliente");
			System.out.println(" 5. Listado de Clientes");
			System.out.println(" 6. Buscar Clientes por nombre");
			System.out.println(" 0. Volver al Menu Principal");
			System.out.println("**************************************************");

			try { //Bloque para captura de excepciones solo se pueden ingresar valores numericos al menu
				int option = scanner.nextInt();

				switch (option) { // Estructura de control condicional para manejar la selección del usuario
				case 1:
					Cliente.altaCliente();
					break;
				case 2:
					Cliente.bajaCliente();
					break;
				case 3:
					Cliente.modificarCliente();
					break;
				case 4:
					Cliente.visualizarCliente();
					break;
				case 5:
					Cliente.listarClientes();
					break;
				case 6:
					Cliente.buscarClientePorNombre();
					break;
				case 0:
					back = true;
					break;
				default:
					System.out.println("Opcion no valida. Intente nuevamente.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Por favor, ingrese una opción numérica.");
				scanner.next();
			}
		}
	}

	public static void gestionarEmpleados() {
		// Código para gestionar empleados
		System.out.println("Elija la opcion Gestion de Cliente que se encuentra funcional");
	}

	public static void gestionarProveedores() {
		// Código para gestionar proveedores
		System.out.println("Elija la opcion Gestion de Cliente que se encuentra funcional");
	}

	public static void gestionarProductos() {
		// Código para gestionar productos
		System.out.println("Elija la opcion Gestion de Cliente que se encuentra funcional");
	}

	public static void gestionarPedidos() {
		// Código para gestionar pedidos
		System.out.println("Elija la opcion Gestion de Cliente que se encuentra funcional");
	}

	public static void gestionarFacturas() {
		// Código para gestionar facturas
		System.out.println("Elija la opcion Gestion de Cliente que se encuentra funcional");
	}

}
