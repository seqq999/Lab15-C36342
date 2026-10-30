package com.fieldtech.fieldtech_backend.data;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fieldtech.fieldtech_backend.domain.Incidencia;

@Repository
public interface IncidenciaRepository extends JpaRepository<Incidencia, Long> {
    List<Incidencia> findByTecnicoCodigoOrderByFechaReporteDesc(String codigo);
}
