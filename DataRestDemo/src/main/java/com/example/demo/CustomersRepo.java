package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

												//base url
@RepositoryRestResource(collectionResourceRel="customers", path="customers")  //to use only the repository without the @controller
public interface CustomersRepo extends JpaRepository<Customers, Integer>{   //jpa repository contains crud and paging and soringrepository

}
