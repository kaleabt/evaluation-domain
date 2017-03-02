package com.alf.evaluation.speech_eval.rest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/")
public class Evaluations {

	@RequestMapping(value="evals", method = RequestMethod.GET, produces = "Application/json")
	public String getEvaluations() {
		return "Hello World";
	}
}
