package com.nickolss.design_patterns_spring.repository;

import com.nickolss.design_patterns_spring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {}
