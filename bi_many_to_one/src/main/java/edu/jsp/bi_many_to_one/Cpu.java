package edu.jsp.bi_many_to_one;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cpu {
@Id
private int id;
private String name;
private String  brand;
private double frequency;
private int cores;
@OneToMany(mappedBy="cpu")
private List<Laptop>laptop;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public double getFrequency() {
	return frequency;
}
public void setFrequency(double frequency) {
	this.frequency = frequency;
}
public int getCores() {
	return cores;
}
public void setCores(int cores) {
	this.cores = cores;
}
public List<Laptop> getLaptop() {
	return laptop;
}
public void setLaptop(List<Laptop> laptop) {
	this.laptop = laptop;
}
public Cpu() {
	super();
}



}
