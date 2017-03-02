package com.alf.evaluation.speech_eval.domain.evaluation;

import java.util.List;

public class EvaluationOption {

	private List<String> evaluationPurpose;
	private List<String> methodsUsed;
	private List<String> medicalHistory;
	private List<String> parentalConcerns;
	private List<String> currentServices;
	private List<String> hearingVisionProblems;
	private List<String> speechSoundProduction;
	private List<String> oralPeripheralExam;
	private List<String> voice;
	private List<String> speechFluency;
	private List<String> feedingSwallowing;
	private List<String> auditoryComprehension;
	private List<String> expressiveCommunication;
	private List<String> observation;
	private List<String> recommendations;
	
	public List<String> getEvaluationPurpose() {
		return evaluationPurpose;
	}
	public List<String> getMethodsUsed() {
		return methodsUsed;
	}
	public List<String> getMedicalHistory() {
		return medicalHistory;
	}
	public List<String> getParentalConcerns() {
		return parentalConcerns;
	}
	public List<String> getCurrentServices() {
		return currentServices;
	}
	public List<String> getHearingVisionProblems() {
		return hearingVisionProblems;
	}
	public List<String> getSpeechSoundProduction() {
		return speechSoundProduction;
	}
	public List<String> getOralPeripheralExam() {
		return oralPeripheralExam;
	}
	public List<String> getVoice() {
		return voice;
	}
	public List<String> getSpeechFluency() {
		return speechFluency;
	}
	public List<String> getFeedingSwallowing() {
		return feedingSwallowing;
	}
	public List<String> getAuditoryComprehension() {
		return auditoryComprehension;
	}
	public List<String> getExpressiveCommunication() {
		return expressiveCommunication;
	}
	public List<String> getObservation() {
		return observation;
	}
	public List<String> getRecommendations() {
		return recommendations;
	}
}