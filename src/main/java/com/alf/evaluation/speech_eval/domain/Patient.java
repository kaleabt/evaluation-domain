package com.alf.evaluation.speech_eval.domain;

import java.time.LocalDate;

public class Patient {

	private String name;			  
	private String	dateOfbirth;	
	private int ageYears;
	private int ageMonths;
	private int ageDays;
	private LocalDate dateOfEvaluation;
	private String placeOfService;
	private Therapist therapist;
	private String physician;
	private String medicalDiagnosis;
	private String icdCode;
	
	public String getName() {
		return name;
	}
	public String getDateOfbirth() {
		return dateOfbirth;
	}
	public int getAgeYears() {
		return ageYears;
	}
	public int getAgeMonths() {
		return ageMonths;
	}
	public int getAgeDays() {
		return ageDays;
	}
	public LocalDate getDateOfEvaluation() {
		return dateOfEvaluation;
	}
	public String getPlaceOfService() {
		return placeOfService;
	}
	public Therapist getTherapist() {
		return therapist;
	}
	public String getPhysician() {
		return physician;
	}
	public String getMedicalDiagnosis() {
		return medicalDiagnosis;
	}
	public String getIcdCode() {
		return icdCode;
	}
}