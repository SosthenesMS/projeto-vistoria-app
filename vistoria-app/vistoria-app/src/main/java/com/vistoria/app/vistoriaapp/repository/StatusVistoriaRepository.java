package com.vistoria.app.vistoriaapp.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.vistoria.app.vistoriaapp.model.StatusVistoria;

public interface StatusVistoriaRepository extends JpaRepository<StatusVistoria, Integer> {

    Page<StatusVistoria> findAll(Pageable pageable);

}
