package com.example.demo.controller;

import com.example.demo.model.Aluno;
import com.example.demo.model.Cafe;
import com.example.demo.repository.AlunoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class AlunoController {

    private final AlunoRepository alunoRepository;


    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
        alunoRepository.saveAll(List.of(

                new Aluno("Matheus Nogueira", "11111111111", "matheusna2004@gmail.com"),
                new Aluno("Vicenzo Milanesi", "22222222222", "vicenzoM@gmail.com"),
                new Aluno( "Iago Vargas", "33333333333", "iagoV@gmail.com")


        ));
    }


    @PostMapping("/alunos")
    ResponseEntity postAluno(@RequestBody Aluno aluno) {
        if(!aluno.getNome().isEmpty() && aluno.getCpf().isEmpty()){
            alunoRepository.save(aluno);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/alunos/{id}")
    ResponseEntity<Aluno> updateAluno(@PathVariable int id, @RequestBody Aluno aluno) {
        return alunoRepository.findById(id)
                .map(existingAluno -> {
                    aluno.setId(existingAluno.getId()); // Mantém o ID do aluno existente
                    return ResponseEntity.ok(alunoRepository.save(aluno)); // Atualiza o aluno e retorna a resposta com status OK
                })
                .orElseGet(() -> ResponseEntity.status(HttpStatus.CREATED).body(alunoRepository.save(aluno))); // Cria um novo aluno se não encontrado
    }


    @GetMapping("/alunos")
    Iterable<Aluno> getAlunos() {
        return alunoRepository.findAll();
    }

    @GetMapping("/alunos/{id}")
    Optional<Aluno> getAlunosPorId(@PathVariable int id) {
        return alunoRepository.findById(id);
    }


    @DeleteMapping("/alunos/{id}")
    ResponseEntity<Aluno> deleteAluno(@PathVariable int id) {
        if(alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }

}
