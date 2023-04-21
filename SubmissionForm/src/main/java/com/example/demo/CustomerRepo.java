package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

//Crudrepository are some of the inbuild interface that are used to do specific task
//CrudRepository has two parameter --> class and datatype of primary key of the table
public interface CustomerRepo extends JpaRepository<Customers, Integer>{

}
