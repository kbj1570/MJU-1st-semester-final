package entity;

import java.util.Scanner;


public class ELecture {

	private int number;
	private String name;
	private String professorName;
	private String credit;
	private String time;
	public static int num;
	private String hyperLink;
	
	public void read(Scanner scanner) {
		this.number = scanner.nextInt();
		this.name = scanner.next();
		this.professorName = scanner.next();
		this.credit = scanner.next();
		this.time = scanner.next();
	}
	
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfessorName() {
		return professorName;
	}
	public void setProfessorName(String professorName) {
		this.professorName = professorName;
	}
	public String getCredit() {
		return credit;
	}
	public void setCredit(String credit) {
		this.credit = credit;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getHyperLink() {
		return hyperLink;
	}
	
}
