package com.microcare.spring.microcare_spring_boot;

import java.time.LocalDate;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

public class Student {
	private List<Book> books;
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	private int studentId;
	private String studentName;
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", city=" + city + ", dob=" + dob
				+ ", skills=" + skills + "]";
	}
	private String city;
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE) 
	private LocalDate dob;
	private List<String> skills;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public LocalDate getDob() {
		return dob;
	}
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

}
