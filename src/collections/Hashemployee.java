package collections;

import java.util.*;

public class Hashemployee {
	int id,age;
	String name,department;
	
	public Hashemployee(int id,int age,String name,String department ) {
		this.id=id;
		this.age=age;
		this.name=name;
		this.department=department;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	public static void main (String[]args) {
		HashMap<Integer,Hashemployee>map=new HashMap<Integer,Hashemployee>();
		Hashemployee e0=new Hashemployee(21,45,"Ron","CS");
		Hashemployee e2=new Hashemployee(43,54,"Nakul","EEE");
		Hashemployee e3=new Hashemployee(32,34,"Vinayak","EC");
		map.put(1,e0);
		map.put(2, e2);
		map.put(3, e3);
		
		for(Integer k:map.keySet()) {
			Hashemployee employee=map.get(k);
			System.out.println(employee.hashCode());
		}
		
	}
		
		
	}


