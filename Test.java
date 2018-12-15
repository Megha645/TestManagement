package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	private List<Questions> questions= new ArrayList<>();
	private int totalScore;
	
	
	public void addQuestions(Test test,Questions ques,List<Answer> allAnswer) {
		if(getQuestions()==null) {
			setQuestions(new ArrayList<>());
		}
		int quesNum=getQuestions().size()+1;
		ques.setQuestionNumber(quesNum);
		getQuestions().add(ques);
	}
	

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
	
	
}
