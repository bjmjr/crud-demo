package com.benjamim.teste.demo.dto;

import com.benjamim.teste.demo.entity.Cliente;

import java.time.LocalDate;

public class ClienteDTO {

    private Long id;
    private String nome;
    private Integer idade;
    private LocalDate dataNascimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Cliente convertToEnetity(){
        Cliente cliente = new Cliente();
        cliente.setId(this.id);
        cliente.setNome(this.nome);
        cliente.setIdade(this.idade);
        cliente.setDataNascimento(this.dataNascimento);
        return cliente;
    }
}
