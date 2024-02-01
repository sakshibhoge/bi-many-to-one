package edu.jsp.bi_many_to_onecontroller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import edu.jsp.bi_many_to_one.Cpu;
import edu.jsp.bi_many_to_one.Laptop;

public class Save {

public static void  main(String[]args) {
		
		
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("bi_many_to_one");
		EntityManager manager=factory.createEntityManager();
		EntityTransaction transaction=manager.getTransaction();
		
		Cpu cpu=new Cpu();
		cpu.setBrand("AMD");
		cpu.setCores(32);
		cpu.setFrequency(5.2);
		cpu.setId(1);
		cpu.setName("THreadipper");
		
		
		Laptop laptop=new Laptop();
		laptop.setCost(145000);
		laptop.setCpu(cpu);
		laptop.setMemory(32);
		laptop.setModel("rog strix");
		laptop.setId(2);
		laptop.setName("lenevo");
		
		Laptop laptop1=new Laptop();
		laptop1.setCost(165000);
		laptop1.setCpu(cpu);
		laptop1.setMemory(64);
		laptop1.setModel("rog strix");
		laptop1.setId(3);
		laptop1.setName("acer");
		
		
		
		
		
		List<Laptop>laptops=new ArrayList<>();
		laptops.add(laptop);
		laptops.add(laptop1);
		
		
		transaction.begin();
		manager.persist(laptop);
		manager.persist(cpu);
		transaction.commit();
		
}
}