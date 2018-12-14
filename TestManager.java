package com.example.main;

import java.util.ArrayList;
import java.util.List;

import com.example.test.Answer;
import com.example.test.Questions;
import com.example.test.Test;
import com.example.test.User;

public class TestManager {

	Test test=new Test();
		
	public void createTest() {
		if(test.getQuestions()!=null)
		{
			System.out.println("Test is already created");
		}
		//TestManager tm=new TestManager();
		//tm.addQuestions();
	}
	
	public void assignTest(User user,Test test) {
	
		
		Answer ans1=new Answer("ans2");
		Answer ans2=new Answer("ans2");
		Answer ans3=new Answer("ans2");
		
		
		List<Answer> userAns=new ArrayList<>();
		userAns.add(ans1);
		userAns.add(ans2);
		userAns.add(ans3);
		
		
		List<Questions> options=new ArrayList<>();
		options=test.getQuestions();
	
		TestManager tm=new TestManager();
		int score=tm.ExecuteTest(user,options,userAns);
		//System.out.println("Total score for "+user.getName()+" is"+score);
	}
	
	public int ExecuteTest(User user,List<Questions> options,List<Answer> userAns) {
		Answer correctAns=null;
		 List<Answer> correctAnswer=new ArrayList<>();
		int totalScore=0;
			for (Questions ques : options) {
				List<Answer> answers=ques.getAllAnswers();
				for (Answer answer : answers) {
					if(answer.getIsCorrect()==true)
					{
						 correctAns = answer;
						 correctAnswer.add(correctAns);
					}
						 
				}
				
			}
			for (Answer answer : correctAnswer) {
				System.out.println("Correct answers from questions "+answer.getAnswer());
			}
		
		user.setScore(totalScore);
		return user.getScore();
	}
	
	public static void main(String[] args) {
		TestManager tm=new TestManager();
		//add list of questions
		//tm.createTest();
		Test test=new Test();
		Answer ques1ans1= new Answer("ques1ans1",false);
		Answer ques1ans2=new Answer("ans2",true);
		Answer ques1ans3=new Answer("ans3",false);
		Answer ques1ans4=new Answer("ans4",false);
		
		List<Answer> ansSet1=new ArrayList<>();
		ansSet1.add(ques1ans1);
		ansSet1.add(ques1ans2);
		ansSet1.add(ques1ans3);
		ansSet1.add(ques1ans4);
		
		Answer ques2ans1=new Answer("ans1",true);
		Answer ques2ans2=new Answer("ans2",false);
		Answer ques2ans3=new Answer("ans3",false);
		Answer ques2ans4=new Answer("ans4",false);
		
		List<Answer> ansSet2=new ArrayList<>();
		ansSet2.add(ques2ans1);
		ansSet2.add(ques2ans2);
		ansSet2.add(ques2ans3);
		ansSet2.add(ques2ans4);
		
		Answer ques3ans1=new Answer("ans1",false);
		Answer ques3ans2=new Answer("ans2",false);
		Answer ques3ans3=new Answer("ans3",true);
		Answer ques3ans4=new Answer("ans4",false);
		
		List<Answer> ansSet3=new ArrayList<>();
		ansSet3.add(ques3ans1);
		ansSet3.add(ques3ans2);
		ansSet3.add(ques3ans3);
		ansSet3.add(ques3ans4);
		
		Questions ques1=new Questions("abc");
		Questions ques2=new Questions("xyz");
		Questions ques3=new Questions("def");
		
		//Test test=new Test();
		test.addQuestions(test,ques1,ansSet1);
		test.addQuestions(test,ques2,ansSet2);
		test.addQuestions(test,ques3,ansSet3);
		
		User user1=new User("Megha","admin","megha123","megha123");
		User user2=new User("Aditi","student","megha123","megha123");
		User user3=new User("Ekta","teacher","megha123","megha123");
		
		tm.assignTest(user1,test);
		
		
	}
}
