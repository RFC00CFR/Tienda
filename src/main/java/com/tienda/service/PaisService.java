package com.tienda.service;

import com.tienda.entity.Pais;
import java.util.List;
import com.tienda.service.IPaisService;
import com.tienda.repository.PaisRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PaisService implements IPaisService {
    
    //Inyeccion de dependencias
    @Autowired
    private PaisRepository paisRepository;
    
    @Override
    public List<Pais> listCountry() {
        return (List<Pais>) paisRepository.findAll();
    }

}
