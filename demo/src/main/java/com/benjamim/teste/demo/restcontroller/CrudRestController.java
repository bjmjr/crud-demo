package com.benjamim.teste.demo.restcontroller;

import com.benjamim.teste.demo.dto.ClienteDTO;
import com.benjamim.teste.demo.entity.Cliente;
import com.benjamim.teste.demo.exception.BusinessException;
import com.benjamim.teste.demo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController("/cliente")
public class CrudRestController {

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ClienteDTO> findById(@PathVariable(value = "id") Long id){
        Cliente cliente = clienteRepository.findById(id).orElseThrow(BusinessException::new);
        return ResponseEntity.ok(cliente.convertToDTO());
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity adicionar(@RequestBody ClienteDTO clienteDTO){
        clienteRepository.save(clienteDTO.convertToEnetity());
        return (ResponseEntity) ResponseEntity.ok();
    }

    @PutMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity alterar(@RequestBody ClienteDTO clienteDTO){
        clienteRepository.save(clienteDTO.convertToEnetity());
        return (ResponseEntity) ResponseEntity.ok();
    }

    @DeleteMapping(value = "{id}", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity delete(@PathVariable(value = "id") Long id){
        clienteRepository.deleteById(id);
        return (ResponseEntity) ResponseEntity.ok();
    }

}
