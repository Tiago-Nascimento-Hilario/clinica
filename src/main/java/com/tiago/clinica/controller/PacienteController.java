package com.tiago.clinica.controller;

import com.tiago.clinica.model.Paciente;
import com.tiago.clinica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private PacienteRepository pacienteRepository;

    @GetMapping
    public List<Paciente> listarPaciente(){
        return pacienteRepository.findAll();
    }

    @PostMapping
    public Paciente cadastrarPaciente(@RequestBody Paciente paciente){
       return pacienteRepository.save(paciente);
    }
}
