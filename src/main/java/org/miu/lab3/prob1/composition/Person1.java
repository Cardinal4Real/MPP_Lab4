package org.miu.lab3.prob1.composition;


public class Person1 {

	private String name;
	private Job job;
	Person1(String name, Job job) {
		this.name = name;
		this.job = job;
	}
	Person1(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		if(job != null) {
			return job.getSalary();
		}else{
			return 0.0;
		}
	}

	@Override
	public boolean equals(Object aPerson) {
		if(!(aPerson instanceof Person1 p)) return false;
		if(p.job == null || this.job==null) return false;
		return this.name.equals(p.name) && this.job.getSalary() == p.job.getSalary();
	}

	public static void main(String[] args) {
		Person1 p1 = new Person1("Joe", new Job("Teaching",30000));
		Person1 p2 = new Person1("Joe");

		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));

	}

}
