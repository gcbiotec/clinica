package br.com.fundatec.clinica.controller;

import br.com.fundatec.clinica.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clinica/consultas")
public class ClinicaController {

    @Autowired
    private ConsultaService consultaService;

//    @GetMapping
//    public ResponseEntity<CollectionProjection> findAllConsulta() {
//        List<Consulta> resultado = consultaService.findAllConsulta();
//
//        return new ResponseEntity<>(convertToProjection(resultado), HttpStatus.OK);
//    }

//    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
//    public ResponseEntity<Consulta> cadastraConsulta(@RequestBody ConsultaRequest request) {
//        Consulta consultaSalva = consultaService.salva(request);
//
//        return new ResponseEntity<>(consultaSalva, HttpStatus.OK);
//    }

}
