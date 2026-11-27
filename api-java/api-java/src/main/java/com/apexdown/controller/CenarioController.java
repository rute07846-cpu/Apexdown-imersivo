package com.apexdown.controller;
import com.apexdown.model.Cenario;
import com.apexdown.repository.CenarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/cenarios")
@CrossOrigin(origins="*")
public class CenarioController {
  @Autowired CenarioRepository repo;
  @GetMapping public List<Cenario> listar(){return repo.findAll();}
  @PostMapping public Cenario criar(@RequestBody Cenario c){return repo.save(c);}
}