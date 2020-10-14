package br.com.fundatec.clinica.controller;

import br.com.fundatec.clinica.controller.response.ConsultaProjection;
import br.com.fundatec.clinica.controller.response.ProjectionCollection;
import br.com.fundatec.clinica.domain.Consulta;
import br.com.fundatec.clinica.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clinica/consultas")
public class ClinicaController {

    @Autowired
    private ConsultaService consultaService;

    @GetMapping
    public ResponseEntity<ProjectionCollection> findAllConsulta() {
        //public ResponseEntity<List<Consulta>> findAllConsulta() {

        List<Consulta> resultado = consultaService.findAllConsulta();
        return new ResponseEntity<>(convertToProjection(resultado), HttpStatus.OK);

        //return new ResponseEntity<>(resultado, HttpStatus.OK);
    }

//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Consulta> cadastraConsulta(@RequestBody ConsultaRequest request) {
//        Consulta consultaSalva = consultaService.salva(request);
//
//        return new ResponseEntity<>(consultaSalva, HttpStatus.OK);
//    }

    private ProjectionCollection convertToProjection(List<Consulta> consultas) {
        List<ConsultaProjection> resultado = new ArrayList<>();

        for (Consulta consulta : consultas) {
            resultado.add(ConsultaProjection.create(consulta));
        }
        return new ProjectionCollection(resultado);
    }

}
