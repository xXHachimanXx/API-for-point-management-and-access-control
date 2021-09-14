package com.dio.APIforpointmanagementandaccesscontrol.repository;

import com.dio.APIforpointmanagementandaccesscontrol.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
