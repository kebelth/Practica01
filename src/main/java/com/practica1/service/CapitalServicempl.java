package com.practica1.service;

import com.practica1.dao.CapitalDao;
import com.practica1.domain.Capital;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CapitalServicempl implements CapitalService{
    
    //Se crea en tiempo de ejecución si aún no se ha creado...
    @Autowired
    private CapitalDao capitalDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Capital> getCapital() {
        return (List<Capital>) capitalDao.findAll();
    }

    @Override
    @Transactional
    public void save(Capital capital) {
        capitalDao.save(capital);
    }
 
    @Override
    @Transactional
    public void delete(Capital capital) {
        capitalDao.delete(capital);
    }
       
    @Override
    @Transactional(readOnly = true)
    public Capital getCapital(Capital capital) {
        return capitalDao.findById(capital.getIdCapital()).orElse(null);
    }
   
    
    
}
