package edu.jsp.bi_many_to_one;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Laptop {
@Id
private int id;
private String name;
private String model;
private double cost;
private double memory;

@ManyToOne
@JoinColumn(name="cpu_id")
private Cpu cpu;

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

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public double getCost() {
	return cost;
}

public void setCost(double cost) {
	this.cost = cost;
}

public double getMemory() {
	return memory;
}

public void setMemory(double memory) {
	this.memory = memory;
}

public Cpu getCpu() {
	return cpu;
}

public void setCpu(Cpu cpu) {
	this.cpu = cpu;
}

public Laptop() {
	super();
}

}
