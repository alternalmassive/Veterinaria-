package model;
import java.util.ArrayList;
public class Human
{
//Constants------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Atributes------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	private String name;
	private int identification;
	private String address;
	private int phone;
//Relations------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	private ArrayList<Pet>pets;
//Constructor----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public Human(String name, int identification, String address, int phone)
	{
		this.name = name;
		this.identification = identification;
		this.address = address;
		this.phone = phone;
		pets = new ArrayList<>();
	}
//Methods--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	
	public int getIdentification()
	{
		return identification;
	}
	public void setIndentification(int identification)
	{
		this.identification = identification;
	}
	
	public String getAddress()
	{
		return address;
	}
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public int getPhone()
	{
		return phone; 
	}
	public void setPhone(int phone)
	{
		this.phone = phone;
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void addPet(String name, String typePet, int age, double weight, char gender, MedicalHistory create)
	{
		Pet newPet = new Pet(name, typePet, age, weight, gender, create);
		pets.add(newPet);
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void checkPet()
	{
		int report;
		report = pets.size();
		System.out.println(report);
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public Pet searchPet(String name)
	{	
		Pet found = null;
		int i = 0;
		while(found == null && i<pets.size())
		{
			if(pets.get(i).getName() == name)
			{
				found = pets.get(i);
			}
			else
			{
				i++;
			}
			return found;
		}	
		return found;
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

}