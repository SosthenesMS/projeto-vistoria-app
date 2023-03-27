package com.vistoria.app.vistoriaapp.repository;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.vistoria.app.vistoriaapp.model.Vistoria;

public interface VistoriaRepository extends JpaRepository<Vistoria, Integer> {

    Page<Vistoria> findAll(Pageable pageable);

    @Query(value = "SELECT * FROM vistoria WHERE idStatusVistoria = 1", nativeQuery = true)
    List<Vistoria> findByidVistoriaAprovada();

    @Query(value = "SELECT * FROM vistoria WHERE idStatusVistoria = 2", nativeQuery = true)
    List<Vistoria> findByidVistoriaReprovada();

    @Query(value = "SELECT * FROM vistoria WHERE idAgenteVistoriador = :idAgenteVistoriador", nativeQuery = true)
    List<Vistoria> findByidAgenteVistoriador(int idAgenteVistoriador);

    @Query(value = "SELECT * FROM vistoria WHERE remessa = :remessa", nativeQuery = true)
    List<Vistoria> findByNumeroDaRemessa(String remessa);

    @Query(value = "SELECT * FROM vistoria WHERE transportador = :transportador", nativeQuery = true)
    List<Vistoria> findByTransportador(String transportador);

    @Query(value = "SELECT * FROM vistoria WHERE cpf = :cpf", nativeQuery = true)
    List<Vistoria> findByCpfMotorista(String cpf);

}
