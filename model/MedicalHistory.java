package model;
import java.util.ArrayList;
public class MedicalHistory
{
//Constants------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public final static String ABIERTO = "abierto";
	public final static String CERRADO = "cerrado";
//Atributes------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	private String dateAdmission;
	private String symptom;
	private String diagnostic;
	private String state;
//Relations------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	private ArrayList<Medicine>medicines;
//Constructor----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public MedicalHistory(String dateAdmission, String symptom, String diagnostic, String state)
	{
		this.dateAdmission = dateAdmission;
		this.symptom = symptom;
		this.diagnostic = diagnostic;
		this.state = state;
		medicines = new ArrayList<>();
	}
//Methods--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public String getDateAdmission()
	{
		return dateAdmission;
	}
	public void setDateAdmission(String dateAdmission)
	{
		this.dateAdmission = dateAdmission;
	}
	
	public String getSymptom()
	{
		return symptom;
	}
	public void setSymptom(String symptom)
	{
		this.symptom = symptom;
	}
	
	public String getDiagnostic()
	{
		return diagnostic;
	}
	public void setDiagnostic(String diagnostic)
	{
		this.diagnostic = diagnostic;
	}
	
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public void addMedicine(Medicine create)
	{
		medicines.add(create);
	}
}