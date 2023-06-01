package com.univesp.agendaservico.repository;

import com.univesp.agendaservico.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
}
