package org.coll;

public class Student extends Dept {
	public void studName() {
	System.out.println("Karthik S");

}
	public void studDept() {
	System.out.println("Bsc Comp science.,");

}
	public void studId() {
	System.out.println("907695");

}
	public static void main(String[] args) {
	Student s=new Student();
	s.studName();
	s.studDept();
	s.studId();
	Dept d=new Dept();
	d.dept();
	Hostel h=new Hostel();
	h.hostelName();
	College c=new College();
	c.collName();
	c.collCode();
	c.collRank();
	}
}
