package model;
import java.util.ArrayList;
public class Pet
{
//Constants------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public final static char PERRO = 'P';
	public final static char GATO = 'G';
	public final static char AVE = 'A';
	public final static char OTRO = 'O';
//Atributes------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	private String name;
	private String typePet;
	private int age;
	private double weight;
	private char gender;
//Relations------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	private MedicalHistory history;
//Constructor----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public Pet(String name, String typePet, int age, double weight, char gender, MedicalHistory history)
	{	
		this.name = name;
		this.typePet = typePet;
		this.age = age;
		this.weight = weight;
		this.gender = gender;
		this.history = history;
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
	
	public String getTypePet()
	{
		return typePet;
	}
	public void setTypePet(String typePet)
	{
		this.typePet = typePet;
	}
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	public char getGender()
	{
		return gender;
	}
	public void setGender(char gender)
	{
		this.gender = gender;
	}
	
	public MedicalHistory getHistory()
	{
		return history;
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}