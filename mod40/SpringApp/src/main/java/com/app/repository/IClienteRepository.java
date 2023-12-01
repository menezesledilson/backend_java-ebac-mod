package com.app.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.app.domain.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Long>{

	
	
}
 

 
