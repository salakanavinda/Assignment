package com.GoWireless.Student;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {
	
	//Reset get method of retrieve all informations of the all students
	@RequestMapping(method = RequestMethod.GET, value="/student/allstudent")
	@ResponseBody
	public List<String> getAllStudents() {
		try{
			//create list type of string and get all lines from file and return as a list
			List<String> collect = Files.readAllLines(Paths.get("studentInfo.txt"));
			return collect;
		}catch(IOException ex) {
			return null;
		}
		
	}
	
	//Reset get method of retrieve One specific student's details
	@RequestMapping(method = RequestMethod.GET, value="/student/get/{id}")
	@ResponseBody
	//set the parameter for data
	public String getStudent(@PathVariable String id) {
		
		try(BufferedReader br = new BufferedReader(new FileReader("studentInfo.txt")) ) {
			String line;
			String ts;
			//when read the one by one lines and check the substring of that line and return info
			while((line=br.readLine())!=null) {
				ts = line;
				if(ts.substring(0,line.indexOf("|")).equals(id)) {
					return line;
				}
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
     
		return "NOT found";//when wrong id is inserting display Not fund
	}

}
