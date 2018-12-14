package com.example.test;

public class Questions {

	private String question;
	private int questionNumber;
	private int marksPerQues;
	private String answer;
	
	public Questions(int quesNum,String ques,int marks,String ans) {
		this.question=ques;
		this.marksPerQues=marks;
		System.out.println(quesNum+" "+ques+" "+" "+ans);
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getQuestionNumber() {
		return questionNumber;
	}
	public void setQuestionNumber(int questionNumber) {
		this.questionNumber = questionNumber;
	}
	public int getMarksPerQues() {
		return marksPerQues;
	}
	public void setMarksPerQues(int marksPerQues) {
		this.marksPerQues = marksPerQues;
	}
}
