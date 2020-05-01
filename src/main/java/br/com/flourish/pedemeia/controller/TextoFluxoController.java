package br.com.flourish.pedemeia.controller;

import javax.validation.constraints.NotNull;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(tags = { "Fluxos" })
@RequestMapping("/fluxos")
public class TextoFluxoController {
	
	@GetMapping(value="/buscar/{parametro}")
	@ApiOperation(value="Busca os textos relacionados a um fluxo determinado pelo parâmetro")
    public void buscar(@PathVariable @NotNull String parametro) {
		
		
    }

}
