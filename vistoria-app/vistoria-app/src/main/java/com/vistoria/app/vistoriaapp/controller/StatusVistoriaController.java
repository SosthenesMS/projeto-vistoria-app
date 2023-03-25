package com.vistoria.app.vistoriaapp.controller;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.vistoria.app.vistoriaapp.model.StatusVistoria;
import com.vistoria.app.vistoriaapp.repository.StatusVistoriaRepository;

@RestController
@RequestMapping(value = "/status/vistorias")
public class StatusVistoriaController {

    @GetMapping
    public ResponseEntity<Page<StatusVistoria>> listarTodosOsStatusDeVistoria(
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "10") int size) {

        PageRequest paging = PageRequest.of(page, size);
        return ResponseEntity.status(HttpStatus.OK).body(statusVistoriaRepository.findAll(paging));
    }

    @GetMapping(value = "/listar/{id}")
    public ResponseEntity<Optional<StatusVistoria>> listarStatusVistoriaPeloId(@PathVariable("id") int id) {
        return ResponseEntity.status(HttpStatus.OK).body(statusVistoriaRepository.findById(id));
    }

    @PostMapping
    public ResponseEntity<Object> criarNovoStatusVistoria(@RequestBody StatusVistoria statusVistoria) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(statusVistoriaRepository.save(statusVistoria));
        } catch (DataIntegrityViolationException d) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Erro ao tentar criar, esse status já existe no banco! " + d.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Erro ao processar a solicitação, por favor verifique os dados! " + e.getMessage());
        }
    }

    @PutMapping
    public ResponseEntity<Object> atualizarNovoStatusVistoria(@RequestBody StatusVistoria statusVistoria) {
        try {
            return ResponseEntity.status(HttpStatus.CREATED).body(statusVistoriaRepository.save(statusVistoria));
        } catch (DataIntegrityViolationException d) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Erro ao tentar atualizar, esse status já existe no banco! " + d.getMessage());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("Erro ao processar a solicitação, por favor verifique os dados! " + e.getMessage());
        }
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<String> deletarStatusVistoria(@PathVariable("id") int id) {
        statusVistoriaRepository.deleteById(id);
        return ResponseEntity.status(HttpStatus.OK).body("Status deletado com sucesso!");
    }

    @Autowired
    private StatusVistoriaRepository statusVistoriaRepository;
}
