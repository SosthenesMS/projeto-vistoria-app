package com.vistoria.app.vistoriaapp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vistoria.app.vistoriaapp.model.Vistoria;

public interface VistoriaRepository extends JpaRepository<Vistoria, Integer> {

    Page<Vistoria> findAll(Pageable pageable);
    
}
