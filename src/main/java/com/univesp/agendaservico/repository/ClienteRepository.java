package com.univesp.agendaservico.repository;

import com.univesp.agendaservico.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
