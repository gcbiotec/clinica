package br.com.fundatec.clinica.service;

import br.com.fundatec.clinica.domain.Consulta;
import br.com.fundatec.clinica.repository.ConsultaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultaService {

    @Autowired
    private ConsultaRepository consultaRepository;

    public List<Consulta> findAllConsulta() {
        return consultaRepository.findAll();
    }

//    public Consulta salva(ConsultaRequest consultaRequest) {
//        return (Consulta) new Object();
//    }
}
