package model;
public class Medicine
{
//Constants------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Atributes------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	private String name;
	private int dose;
	private double costDose;
	private String frequency;
//Relations------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Constructor----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public Medicine(String nameM, int dose, double costDose, String frequency)
	{
		name = nameM;
		this.dose = dose;
		this.costDose = costDose;
		this.frequency = frequency;
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
	
	public int getDose()
	{
		return dose;
	}
	public void setDose(int dose)
	{
		this.dose = dose;
	}
	
	public double getCostDose()
	{
		return costDose;
	}
	public void setCostDose(double costDose)
	{
		this.costDose = costDose;
	}
	
	public String getFrequency()
	{
		return frequency;
	}
	public void setFrequency(String frequency)
	{
		this.frequency = frequency;
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}