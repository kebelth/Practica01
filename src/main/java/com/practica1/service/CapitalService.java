package com.practica1.service;

import com.practica1.domain.Capital;
import java.util.List;


public interface CapitalService {
    
    public List<Capital> getCapital();
    
    public void save(Capital capital);
    
    public void delete(Capital capital);
    
    public Capital getCapital(Capital capital);
    
}
