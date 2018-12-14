package com.example.test;

public class Answer {
	private String answer;
	private boolean isCorrect;
	
	public Answer(String answer, boolean isCorrect) {
		this.answer=answer;
		this.isCorrect=isCorrect;
	}
	
	public Answer(String answer)
	{
		this.answer=answer;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public Boolean getIsCorrect() {
		return isCorrect;
	}
	public void setIsCorrect(Boolean isCorrect) {
		this.isCorrect = isCorrect;
	}
	

}
