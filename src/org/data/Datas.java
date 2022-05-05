package org.data;

public class Datas {

	private void empId(int id) {
		System.out.println("Emp ID :"+id);

	}
	private void empName(String name) {
		System.out.println("Emp Name :"+name);
	}
	public static void main(String[] args) {
		Datas d=new Datas();
		d.empId(555);
		d.empName("Subash");
	}
}
