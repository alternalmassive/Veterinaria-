package model;
import java.util.ArrayList;
public class Pet
{
//Constants------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public final static String PERRO = "perro";
	public final static String GATO = "gato";
	public final static String AVE = "ave";
	public final static String OTRO = "otro";
	public final static char HEMBRA = 'F';
	public final static char MACHO = 'M';
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
	public void setHistory(MedicalHistory history)
	{
		this.history = history;
	}
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void createMedicine(String nameM, int dose, double costDose, String frequency)
	{
		history.addMedicine(new Medicine(nameM, dose, costDose, frequency));
	}
	public String reportHistory()
	{
		String massage = "";
		massage = "Fecha de admision: " + history.getDateAdmission() + "\nSintomas: " + history.getSymptom() + "\nDiagnostico: " + history.getDiagnostic() + "\nEstado: " + history.getState();
		return massage;
	}
}