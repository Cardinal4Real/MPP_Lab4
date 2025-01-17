package org.miu.lab3.prob1.composition;

public class Job{
	private String jobName;
	private double salary;

	public Job(String jobName,double salary) {
		this.salary = salary;
		this.jobName = jobName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
