package inharitance;

public class Employee {
private int empid;
private String empname;
private double basicsalary;
private double HRA;
private double medical;
private double pf;
private double pt;
private double netsalary;
private double grosssalary;

 public Employee(int i, String string, int j)
{
	 
}

public Employee(int empid, String empname, double basicsalary, double hRA, double medical, double pf, double pt,
		double netsalary, double grosssalary) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.basicsalary = basicsalary;
	this.HRA = 0.5*basicsalary;
	this.pf=0.12*basicsalary;
	this.pt=200;
	
	this.medical = medical;
	this.pf = pf;
	this.pt = pt;
	this.netsalary = netsalary;
	this.grosssalary = grosssalary;
}


public int getEmpid() {
	return empid;
}

public void setEmpid(int empid) {
	this.empid = empid;
}

public String getEmpname() {
	return empname;
}

public void setEmpname(String empname) {
	this.empname = empname;
}

public double getBasicsalary() {
	return basicsalary;
}

public void setBasicsalary(double basicsalary) {
	this.basicsalary = basicsalary;
}

public double getHRA() {
	return HRA;
}

public void setHRA(double hRA) {
	HRA = hRA;
}

public double getMedical() {
	return medical;
}

public void setMedical(double medical) {
	this.medical = medical;
}

public double getPf() {
	return pf;
}

public void setPf(double pf) {
	this.pf = pf;
}

public double getPt() {
	return pt;
}

public void setPt(double pt) {
	this.pt = pt;
}

public double getNetsalary() {
	return netsalary;
}

public void setNetsalary(double netsalary) {
	this.netsalary = netsalary;
}

public double getGrosssalary() {
	return grosssalary;
}

public void setGrosssalary(double grosssalary)
{
	this.grosssalary = grosssalary;
}

public double grosssalary()
{
	this.grosssalary=this.basicsalary+this.HRA+this.medical;
	return grosssalary;
}
public double netsalary()
{
	this.netsalary=this.grosssalary-(this.pt+this.pf);
	return netsalary;
}

public static void main(String[] args) {
	Employee E = new Employee (17654,"hgfds",10000);
	System.out.println(E);
			
}
 
}
 


