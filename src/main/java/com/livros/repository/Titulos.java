package com.livros.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.livros.controller.modal.Titulo;

public interface Titulos extends JpaRepository<Titulo,Long>{

}
