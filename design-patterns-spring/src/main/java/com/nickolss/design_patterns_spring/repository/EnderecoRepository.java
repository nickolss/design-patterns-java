package com.nickolss.design_patterns_spring.repository;

import com.nickolss.design_patterns_spring.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, String> {}
