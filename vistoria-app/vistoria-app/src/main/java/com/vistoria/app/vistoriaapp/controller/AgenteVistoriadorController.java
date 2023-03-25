package com.vistoria.app.vistoriaapp.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vistoria.app.vistoriaapp.model.AgenteVistoriador;
import com.vistoria.app.vistoriaapp.repository.AgenteVistoriadorRepository;
import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/agentes")
public class AgenteVistoriadorController {

    @GetMapping
    public ResponseEntity<List<AgenteVistoriador>> listarAgentesVistoriadores() {
        return ResponseEntity.status(HttpStatus.OK).body(agenteVistoriadorRepository.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<AgenteVistoriador>> listarAgentesVistoriadoresPeloId(@PathParam("id") int id) {
        return ResponseEntity.status(HttpStatus.OK).body(agenteVistoriadorRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<Object> criarNovoAgenteVistoriador(@RequestBody AgenteVistoriador agenteVistoriador) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(agenteVistoriadorRepository.save(agenteVistoriador));
        } catch (DataIntegrityViolationException d) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Erro ao tentar criar, esse agente vistoriador já existe no banco! " + d.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Erro ao processar a solicitação, por favor verifique os dados! " + e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<Object> atualizarNovoAgenteVistoriador(@RequestBody AgenteVistoriador agenteVistoriador) {
        try {
            return ResponseEntity.status(HttpStatus.OK).body(agenteVistoriadorRepository.save(agenteVistoriador));
        } catch (DataIntegrityViolationException d) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Erro ao tentar atualizar, esse agente vistoriador já existe no banco! " + d.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Erro ao processar a solicitação, por favor verifique os dados! " + e.getMessage());
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deletarAgenteVistoriador(@PathVariable("id") int id) {
        agenteVistoriadorRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Agente vistoriador deletado com sucesso!");
    }

    @Autowired
    private AgenteVistoriadorRepository agenteVistoriadorRepository;

}
