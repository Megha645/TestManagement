package com.example.test;

import java.util.ArrayList;
import java.util.List;

public class Test {

	private List<Questions> questions= new ArrayList<>();
	private int totalScore;
	
	
	public void addQuestions(Test test,Questions ques,List<Answer> allAnswer) {
		if(test.getQuestions()==null) {
			test.setQuestions(new ArrayList<>());
		}
		int quesNum=test.getQuestions().size()+1;
		Questions questions=new Questions(quesNum,ques.getQuestion(),allAnswer);
		test.getQuestions().add(questions);
	}
	

	public List<Questions> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Questions> questions) {
		this.questions = questions;
	}
	
	
}
