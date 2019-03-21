package model;
import java.util.ArrayList;
public class MedicalHistory
{
//Constants------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

//Atributes------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	private String dateAdmission;
	private String symptom;
	private String diagnostic;
//Relations------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	private ArrayList<Medicine>medicines;
//Constructor----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
	public MedicalHistory(String dateAdmission, String symptom, String diagnostic)
	{
		this.dateAdmission = dateAdmission;
		this.symptom = symptom;
		this.diagnostic = diagnostic;
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
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
}