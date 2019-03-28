package com.GoWireless.Student;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AddStudent {
	
	//reset post method 
	@RequestMapping(method = RequestMethod.POST, value="/add/student")
	@ResponseBody
	public AddStudentReply addstudent(@RequestBody Student student) {
		AddStudentReply add = new AddStudentReply();
		//when pass the values of student then write the information about student into a file
		 try (PrintWriter pw = new PrintWriter(new FileOutputStream("studentInfo.txt"))) {

             //write information
             pw.println(student.toString());

         } catch (FileNotFoundException ex) {
             ex.printStackTrace();
         }
		add.setStuId(student.getStuId());
		add.setName(student.getName());
		add.setAddress(student.getAddress());
		add.setStatus("add");
		
		return add;
	}

}
