package model;
import java.util.ArrayList;
public class Veterinary
{
//Constants------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public final static int QUANTITY_ROOMS = 2;
//Atributes------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Relations------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	private ArrayList<Human>humans;
	private ArrayList<Pet>records;
	private Room[]rooms;
//Constructor----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public Veterinary()
	{
		humans = new ArrayList<>();
		records = new ArrayList<>();
		rooms = new Room[QUANTITY_ROOMS];
	}
//Methods--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public Room[] getRooms()
	{
		return rooms;
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	public boolean checkRoomAvailability()
	{
		boolean availability = false;
		
		for(int i=0; i<QUANTITY_ROOMS && !availability; i++)
		{
			if(rooms[i] == null)
			{
				availability = true;
			}
		}
		return availability;
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	public void addHuman(Human create)
	{	
		humans.add(create);
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	public String addPet(String name, String typePet, int age, double weight, char gender, int identification)
	{   
		String massage = "";
		Human person = searchHuman(identification);
		if (person != null && checkRoomAvailability() == true)
		{
			person.addPet(name, typePet, age, weight, gender, null);
		}
		else
			massage = "no existe el cliente";
		return massage;
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public Human searchHuman(int identification)
	{	
		Human found = null;
		int i = 0;
		while(found == null && i<humans.size())
		{
			if(humans.get(i).getIdentification() == identification)
			{
				found = humans.get(i);
			}
			else
			{
				i++;
			}
			return found;
		}	
		return found;
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public Pet searchPet(String name, int identification)
	{	
		Pet found = null;
		Human person = searchHuman(identification);
		if(person != null)
		{
			found = person.searchPet(name);
		}
		return found;
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	public String checkPet(int identification)
	{   
		String massage = "";
		Human person = searchHuman(identification);
		if (person != null)
		{
			person.checkPet();
		}
		else
			massage = "no existe el cliente";
		return massage;
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void hospitalizePet(String name, int identification)
	{
		
		for(int i = 0;i<QUANTITY_ROOMS;i++)
		{	
			if(checkRoomAvailability() == true)
			{
				rooms[i]= new Room (searchPet(name, identification));
			}
		}
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void createHistory(String name, String typePet, int age, double weight, char gender, int identification, String dateAdmission, String symptom, String diagnostic, String state)
	{
		Pet mascota = searchPet(name, identification);
		if(checkRoomAvailability() == true)
		{
			mascota = new Pet(name, typePet, age, weight, gender, new MedicalHistory(dateAdmission, symptom, diagnostic, state));
		}
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------	
	public void createMedicine(String name, int identification, String nameM, int dose, double costDose, String frequency)
	{
		Pet mascota = searchPet(name, identification);
	
		mascota.createMedicine(nameM, dose, costDose, frequency);
	}
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public String showReportPet(String name, int identification)
	{
		String mensaje = "";
		Pet mascota2 = searchPet(name, identification);
		for(int i = 0; i<QUANTITY_ROOMS; i++)
		{
			if(rooms[i].equals(mascota2))
			{
				mensaje = ""+ mascota2.reportHistory();
			}
			else
			{
				mensaje = "la mascota no esta hospitalizada";
			}
		}
		return mensaje;
	}
}