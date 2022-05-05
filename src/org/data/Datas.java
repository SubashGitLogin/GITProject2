package org.data;

public class Datas {

	private void emp() {
		System.out.println("Emp NAme : Subash");

	}
	private void emp(int id) {
		System.out.println("Emp ID :"+id);

	}private void salary(double sal) {
		System.out.println("Salary :"+sal);
	}
	public static void main(String[] args) {
		Datas d=new Datas();
		d.emp();
		d.emp(555);
		d.salary(65432643.2351);
	}
}
