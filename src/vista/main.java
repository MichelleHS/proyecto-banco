package vista;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

import modelo.ejecutivo;
import modelo.juridico;
import modelo.natural;

public class main {

	public static void main(String[] args){ 
		LocalDate ahora = LocalDate.now();
		String opcion;
		String cliRut;
		String cliNombre;
		String cliNacionalidad;
		String cliCodigo;
		String cueSaldo;
		String cueSobrecuenta;
		String cliTipo;
		String natPatrimonio;
		String jurRazonSocial;
		String cliEdad;
		String o="1"; 
		String op="2";
		String e="18";

	
		System.out.println(" Sistema BANCO INTER ");
		System.out.println("---------------------");
		System.out.println("1. Ingresar Cliente");
		System.out.println("2. Abrir Cuenta"); 
		System.out.println("3. Realizar Giro");	
		System.out.println("4. Realizar Deposito");
		System.out.println("5. Cuentas Bancarias");
		opcion=JOptionPane.showInputDialog(null, "Ingrese una Opcion :", "MENU PRINCIPAL", 3);
		switch (opcion.charAt(0)){
		case '1':
			System.out.println("FORMULARIO DE INGRESO DE CLIENTE");
			System.out.println("---------------------------------");
			cliRut = JOptionPane.showInputDialog(null, "Rut:", "REGISTRO DE CLIENTE", 3);
			System.out.println(cliRut);
			cliNombre = JOptionPane.showInputDialog(null, "Nombre Completo:", "REGISTRO DE CLIENTE", 3);
			System.out.println(cliNombre);
			cliNacionalidad = JOptionPane.showInputDialog(null, "Nacionalidad:", "REGISTRO DE CLIENTE", 3);
			System.out.println(cliNacionalidad);
			cliTipo =JOptionPane.showInputDialog(null,"Natural=1 - Juridico=2","REGISTRO DE CLIENTE",3);
				if(cliTipo.compareTo(o) == 0) {
					System.out.println(cliTipo);
					natPatrimonio = JOptionPane.showInputDialog(null,"Patrimonio: $", "CLIENTE NATURAL",3);
					System.out.println(natPatrimonio);
				}else if(cliTipo.compareTo(op) == 0 ){
					jurRazonSocial = JOptionPane.showInputDialog(null,"Razon Social:", "CLIENTE JURIDICO",3);
				}else {
					JOptionPane.showInputDialog("Opcion no valida");
				}
			break;
		case '2':
			System.out.println("FORMULARIO DE APERTURA DE CUENTA");
			System.out.println("--------------------------------");
			cliEdad=JOptionPane.showInputDialog(null, "Fecha de Nacimiento yyyy-mm-dd", "FORMULARIO DE APERTURA",3);
			DateTimeFormatter fmt = null;
			LocalDate fecNacimiento = LocalDate.parse(cliEdad, fmt);
			Period periodo = Period.between(fecNacimiento, ahora);
			System.out.printf("Tu edad es: %s años",periodo.getYears());
			
			/*if () {
				cliCodigo = JOptionPane.showInputDialog(null, "Ingrese Codigo Cliente:", "APERTURA CUENTA BANCARIA", 3);
				cueSaldo = JOptionPane.showInputDialog(null, "Saldo Inicial: $", "APERTURA CUENTA BANCARIA", 3);
				cueSobrecuenta = JOptionPane.showInputDialog(null, "Sobregiro: (1=si, 2=no)", "APERTURA CUENTA BANCARIA", 3);}
			else
				System.out.println("No posee la edad suficiente para abrir una cuenta.");
			break;		**/
		
		default:
			System.out.println("OPCION INCORRECTA");
			break;
		}
		
		System.out.println("-------------------------------");	
		
		}
	}
		
		
	


		