package com.example.Tribici.service;

import com.example.Tribici.model.Estacion;
import com.example.Tribici.repository.EstacionRepository;
import lombok.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EstacionService {

    private EstacionRepository estacionRepository;

    public List<Estacion> getAll(){
        return estacionRepository.findAll();
    }

}
