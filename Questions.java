package com.example.test;

import java.util.ArrayList;
import java.util.List;


public class Questions {

	private String question;
	private int questionNumber;
	private int marksPerQues;
	private List<Answer> allAnswers=new ArrayList<>();
	private Answer userResponse;
	
	public Answer getUserResponse() {
		return userResponse;
	}
	public void setUserResponse(Answer userResponse) {
		this.userResponse = userResponse;
	}
	public List<Answer> getAllAnswers() {
		return allAnswers;
	}
	public void setAllAnswers(List<Answer> allAnswers) {
		this.allAnswers = allAnswers;
	}
	
	public Questions(String ques)
	{
		this.question=ques;
	}
	public Questions(int quesNum,String ques,List<Answer> allAsnwers) {
		this.question=ques;
		this.allAnswers=allAsnwers;
		//this.marksPerQues=marks;
		/*System.out.println("Question "+quesNum+": "+ques);
			for (Answer answer : allAsnwers)
			{
				System.out.println(answer.getAnswer());
			}*/
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
