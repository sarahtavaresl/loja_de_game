package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.Categoria;


public interface CategoriaRepository extends JpaRepository<Categoria,Long> {

	public List<Categoria> findAllByCategoriaContainingIgnoreCase(@Param("categoria")String categoria);
}
