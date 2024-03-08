package org.example.services;

import org.example.models.Examen;
import org.example.repositories.ExamenRepository;

public class ExamenServiceImpl  implements ExamenService{
    private ExamenRepository examenRepository;


    public ExamenServiceImpl(ExamenRepository examenRepository) {
        this.examenRepository = examenRepository;
    }

    @Override
    public Examen findExamenPorNombre(String nombre) {
        examenRepository.findAll().stream().filter(e->)


        return null;
    }
}
