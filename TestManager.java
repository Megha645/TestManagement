package com.example.main;

import java.util.ArrayList;

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
	
	public void addQuestions(String ques,int marks,String ans) {
		if(test.getQuestions()==null) {
			test.setQuestions(new ArrayList<>());
		}
		int quesNum=test.getQuestions().size()+1;
		Questions questions=new Questions(quesNum,ques, marks,ans);
		test.getQuestions().add(questions);
	}
	
	public void addUser(String name,String type,String loginId,String password)
	{
		User user=new User(name,type,loginId,password);
		user.getUser().add(user);
	}
	
	public static void main(String[] args) {
		TestManager tm=new TestManager();
		//add list of questions
		//tm.createTest();
		
		tm.addQuestions("abc",2,"xxx");
		tm.addQuestions("xyz", 4,"yyy");
		tm.addQuestions("def", 1,"zzz");
		
		tm.addUser("Megha","admin","megha123","megha123");
		tm.addUser("Ekta","Student","megha123","megha123");
		tm.addUser("Aditi","Teacher","megha123","megha123");
		
		
	}
}
