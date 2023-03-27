package com.vistoria.app.vistoriaapp.service;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vistoria.app.vistoriaapp.model.Vistoria;
import com.vistoria.app.vistoriaapp.repository.VistoriaRepository;

@Service
public class VistoriaService {

    public List<Vistoria> obterVistoriasPeloIntervaloDeData(LocalDate dataInicial, LocalDate dataFinal) {
        return vistoriaRepository.findByIntervaloDeData(dataInicial, dataFinal);
    }

    @Autowired
    private VistoriaRepository vistoriaRepository;
}
