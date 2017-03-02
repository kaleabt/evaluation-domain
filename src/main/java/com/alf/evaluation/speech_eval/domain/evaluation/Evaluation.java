package com.alf.evaluation.speech_eval.domain.evaluation;

import java.util.List;

import com.alf.evaluation.speech_eval.domain.Patient;
import com.alf.evaluation.speech_eval.domain.Therapist;

public class Evaluation {

	private Patient patient;
	private Therapist therapist;
	private String evaluationPurpose;
	private String methodsUsed;
	private String medicalHistory;
	private String parentalConcerns;
	private String currentServices;
	private String hearingVisionProblems;
	private String speechSoundProduction;
	private String oralPeripheralExam;
	private String voice;
	private String speechFluency;
	private String feedingSwallowing;
	private LanguageAssessment languageAssessment;
	private String auditoryComprehension;
	private String expressiveCommunication;
	private String observation;
	private String recommendations;
	private List<String> goals;
	
	public Patient getPatient() {
		return patient;
	}
	public Therapist getTherapist() {
		return therapist;
	}
	public String getEvaluationPurpose() {
		return evaluationPurpose;
	}
	public String getMethodsUsed() {
		return methodsUsed;
	}
	public String getMedicalHistory() {
		return medicalHistory;
	}
	public String getParentalConcerns() {
		return parentalConcerns;
	}
	public String getCurrentServices() {
		return currentServices;
	}
	public String getHearingVisionProblems() {
		return hearingVisionProblems;
	}
	public String getSpeechSoundProduction() {
		return speechSoundProduction;
	}
	public String getOralPeripheralExam() {
		return oralPeripheralExam;
	}
	public String getVoice() {
		return voice;
	}
	public String getSpeechFluency() {
		return speechFluency;
	}
	public String getFeedingSwallowing() {
		return feedingSwallowing;
	}
	public LanguageAssessment getLanguageAssessment() {
		return languageAssessment;
	}
	public String getAuditoryComprehension() {
		return auditoryComprehension;
	}
	public String getExpressiveCommunication() {
		return expressiveCommunication;
	}
	public String getObservation() {
		return observation;
	}
	public String getRecommendations() {
		return recommendations;
	}
	public List<String> getGoals() {
		return goals;
	}
}