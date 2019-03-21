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
			System.out.println("1. Verificar si hay cuartos disponibles");
			System.out.println("2. Registrar Cliente ");
			System.out.println("3. ***********************************");
			System.out.println("4. ***********************************");
			System.out.println("5. ***********************************");
			System.out.println("6. Para salir");
			options = reader.nextInt();
			switch(options)
			{	
				case 1:
					checkRooms();
					break;
				case 2:
					addHuman();
					break;
				case 3:
					veterinary1 = new Veterinary();
					veterinary1.checkHuman();
					break;
				case 4:
					
					break;
				case 5:
					
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
		veterinary1 = new Veterinary();
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
		
		veterinary1 = new Veterinary();
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
}


