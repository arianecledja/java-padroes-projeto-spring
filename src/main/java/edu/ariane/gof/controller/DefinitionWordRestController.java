package edu.ariane.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.ariane.gof.model.DefinitionWord;
import edu.ariane.gof.service.DefinitionService;

@RestController
@RequestMapping("")
public class DefinitionWordRestController {

	@Autowired
	private DefinitionService definitionService;
	
	@GetMapping("/{word}")
	public ResponseEntity<DefinitionWord> buscarPorId(@PathVariable String word) {
		return ResponseEntity.ok(definitionService.buscarPalavra(word));
	}
}
