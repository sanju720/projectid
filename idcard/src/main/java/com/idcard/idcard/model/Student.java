package com.idcard.idcard.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Username")
	private String Username;
	@Column(name="Contact_no")
	private int Contact_no;
	@Column(name="Email")
	private String Email;
	@Column(name="Password")
	private String Password;
	
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public int getContact_no() {
		return Contact_no;
	}
	public void setContact_no(int contact_no) {
		Contact_no = contact_no;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "Student [Username=" + Username + ", Contact_no=" + Contact_no + ", Email=" + Email + ", Password="
				+ Password + "]";
	}
	public Student(String username, int contact_no, String email, String password) {
		super();
		Username = username;
		Contact_no = contact_no;
		Email = email;
		Password = password;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
