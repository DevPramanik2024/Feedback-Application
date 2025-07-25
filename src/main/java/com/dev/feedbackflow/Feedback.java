package com.dev.feedbackflow;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Feedback {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
private String name;
private String email;
private String comments;

//Getters & Setters
}
