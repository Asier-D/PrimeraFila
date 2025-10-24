package com.registro.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.registro.demo.model.Perro;

public interface PerroJpaRepository  extends JpaRepository<Perro, Serializable>{

}
