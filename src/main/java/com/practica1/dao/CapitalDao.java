package com.practica1.dao;

import com.practica1.domain.Capital;
import org.springframework.data.repository.CrudRepository;

public interface CapitalDao extends CrudRepository<Capital, Long>{
    
}
