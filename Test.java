package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	private List<Questions> questions= new ArrayList<>();
	private int totalScore;
	
	
	public void addQuestions(Test test,Questions ques,List<Answer> options) {
		if(getQuestions()==null) {
			setQuestions(new ArrayList<>());
		}
		int questionNumber=getQuestions().size()+1;
		ques.setQuestionNumber(questionNumber);
		Questions questions=new Questions(questionNumber,ques.getQuestion(),options);
		getQuestions().add(questions);
	}
	

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
	
	
}
