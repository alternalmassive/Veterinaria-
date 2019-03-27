package ui;
import model.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main
{
	//Relaciones
	private Veterinary veterinary1;
	private Scanner reader;
	public Main()
	{	
		veterinary1 = new Veterinary();
		init();
	}
	
	
	public static void main(String[] args)
	{
		Main finish = new Main();
	}
	
	public void init()
	{	
		reader = new Scanner(System.in);
		int options = 0;
		
		while(options != 6)
		{ 	
			System.out.println("Digite el numero de la operacion que desea realizar");
			System.out.println("1. Registrar cliente");
			System.out.println("2. Registrar mascotas");
			System.out.println("3. Hospitalizar mascotas");
			System.out.println("4. Veficar cuartos disponibles");
			System.out.println("5. Reporte de mascota hositalizada");
			System.out.println("6. Para salir");
			options = reader.nextInt();
			switch(options)
			{	
				case 1:
					addHuman();
					break;
				case 2:
					addPet();
					break;
				case 3:
					menuHospitalizePet();
					break;
				case 4:
					checkRooms();
					break;
				case 5:
					showReportPet();
					break;
				case 6:
					System.out.println("Aplicacion finalizada");
					break;
				default:
					System.out.println("Operacion invalida");
					break;
			}
		}
	}
	
	public void checkRooms()
	{
		boolean report;
		report = veterinary1.checkRoomAvailability();
		System.out.println(report);
	}
	
	public void addHuman()
	{	
		String name = "";
		int identification  = 0;
		String address = "";
		int phone = 0;
		
		reader = new Scanner(System.in);
		
		System.out.println("Ingrese el nombre del cliente:");
		name = reader.nextLine();
		System.out.println("Ingrese la cedula del cliente:");
		identification = reader.nextInt();
		System.out.println("Ingrese la direccion del cliente:");
		address = reader.nextLine();
		reader.nextLine();
		System.out.println("Ingrese el numero del cliente:");
		phone = reader.nextInt();
		
		veterinary1.addHuman(new Human(name, identification, address, phone));
	}
	
	public void addPet()
	{
		int identification = 0;
		String name = ""; 
		String typePet = ""; 
		int age = 0;
		double weight = 0.0; 
		char gender;
		
		reader = new Scanner(System.in);
		
		System.out.println("Ingrese la cedulad del dueno:");
		identification = reader.nextInt();
		System.out.println("Ingrese el nombre de la mascota:");
		name = reader.nextLine();
		reader.nextLine();
		System.out.println("Ingrese el tipo de animal:");
		typePet = reader.nextLine();
		System.out.println("Ingrese la edad de la mascota:");
		age = reader.nextInt();
		System.out.println("Ingrese la peso de la mascota:");
		weight = reader.nextDouble();
		System.out.println("Ingrese el sexo de la mascota:");
		gender = reader.next().charAt(0);
		
		veterinary1.addPet(name, typePet, age, weight, gender, identification);
	}
	
	public void checkPet()
	{
		int identification = 0;
		
		reader = new Scanner(System.in);
		
		System.out.println("Ingrese la cedula:");
		identification = reader.nextInt();
		
		veterinary1.checkPet(identification);
	}
	
	public void menuHospitalizePet()
	{
		reader = new Scanner(System.in);
		int options = 0;
		
		while(options != 4)
		{ 	
			System.out.println("Digite el numero de la operacion que desea realizar");
			System.out.println("1. Crear historia clinica");
			System.out.println("2. Hospitalizar mascota");
			System.out.println("3. Ingresar medicinas resetadas");
			System.out.println("4. Para salir");
			options = reader.nextInt();
			switch(options)
			{	
				case 1:
					createHistory();
					break;
				case 2:
					hospitalizePet();
					break;
				case 3:
					createMedicine();
					break;
				case 4:
					System.out.println("Aplicacion finalizada");
					break;
				default:
					System.out.println("Operacion invalida");
					break;
			}
		}
	}
	
	public void hospitalizePet()
	{
		int identification = 0;
		String name = ""; 
		String typePet = ""; 
		int age = 0;
		double weight = 0.0; 
		char gender;
		String dateAdmission = "";
		String symptom = "";
		String diagnostic = "";
		String state = "";
		
		reader = new Scanner(System.in);
		
		System.out.println("Para hozpitalizar su mascota debe ingresar los siguientes datos:\n");
		System.out.println("Ingrese la cedulad del dueno:");
		identification = reader.nextInt();
		System.out.println("Ingrese el nombre de la mascota:");
		name = reader.nextLine();
		reader.nextLine();
		
		veterinary1.hospitalizePet(name, identification);
	}
	
	public void createHistory()
	{
		int identification = 0;
		String name = ""; 
		String typePet = ""; 
		int age = 0;
		double weight = 0.0; 
		char gender;
		String dateAdmission = "";
		String symptom = "";
		String diagnostic = "";
		String state = "";
		
		reader = new Scanner(System.in);
		
		System.out.println("Para crear la historia clinica de su mascota debe actualizar los siguientes datos:\n");
		System.out.println("Ingrese la cedulad del dueno:");
		identification = reader.nextInt();
		System.out.println("Ingrese el nombre de la mascota:");
		name = reader.nextLine();
		reader.nextLine();
		System.out.println("Ingrese el tipo de animal:");
		typePet = reader.nextLine();
		System.out.println("Ingrese la edad de la mascota:");
		age = reader.nextInt();
		System.out.println("Ingrese la peso de la mascota:");
		weight = reader.nextDouble();
		System.out.println("Ingrese el sexo de la mascota:");
		gender = reader.next().charAt(0);
		System.out.println("Para crear una historia clinica ingrese los siguientes datos:\n");
		System.out.println("Ingrese la fecha de hospitalizacion de la mascota:");
		dateAdmission = reader.nextLine();
		reader.nextLine();
		System.out.println("Ingrese los sintomas de la mascota:");
		symptom = reader.nextLine();
		System.out.println("Ingrese el diagnostico de la mascota:");
		diagnostic = reader.nextLine();
		System.out.println("Ingrese el estado de la historia clinica:");
		state = reader.nextLine();
		
		veterinary1.createHistory(name, typePet, age, weight, gender, identification, dateAdmission, symptom, diagnostic, state);
	}
	
	public void createMedicine()
	{
		int identification = 0;
		String name = "";
		String nameM = "";
		int dose = 0;
		double costDose = 0.0; 
		String frequency = "";
		
		reader = new Scanner(System.in);
		
		System.out.println("Ingrese la cedulad del dueno:");
		identification = reader.nextInt();
		System.out.println("Ingrese el nombre de la mascota:");
		name = reader.nextLine();
		reader.nextLine();
		System.out.println("Ingrese el nombre de la medicina:");
		nameM = reader.nextLine();
		System.out.println("Ingrese la cantiidad de dosis:");
		dose = reader.nextInt();
		System.out.println("Ingrese el precio por dosis de la medicina:");
		costDose = reader.nextDouble();
		System.out.println("Ingrese la frecuencia a la que debe suministrar la medicina:");
		frequency = reader.nextLine();
		reader.nextLine();
		
		veterinary1.createMedicine(name, identification, nameM, dose, costDose, frequency);
	}
	public void showReportPet()
	{
		int identification = 0;
		String name = "";
		
		reader = new Scanner(System.in);
		
		System.out.println("Ingrese la cedula del dueno:");
		identification = reader.nextInt();
		System.out.println("Ingrese el nombre de la mascota:");
		name = reader.nextLine();
		reader.nextLine();
		
		System.out.println(veterinary1.showReportPet(name, identification));
	}
}


