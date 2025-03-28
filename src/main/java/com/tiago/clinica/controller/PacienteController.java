package com.tiago.clinica.controller;

import com.tiago.clinica.model.Paciente;
import com.tiago.clinica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
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
    public Paciente cadastrarPaciente( @Validated @RequestBody Paciente paciente){
       return pacienteRepository.save(paciente);
    }

    @PutMapping("/{id}")
    public  void atualizaPaciente(@PathVariable Long id, @RequestBody Paciente pacienteAtualizado){
        pacienteAtualizado.setId(id);
        pacienteRepository.save(pacienteAtualizado);
    }

    @DeleteMapping("/{id}")
    public void deletePaciente(@PathVariable Long id){
        pacienteRepository.deleteById(id);
    }
}
