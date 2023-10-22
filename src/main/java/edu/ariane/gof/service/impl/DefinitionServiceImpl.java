package edu.ariane.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.ariane.gof.model.DefinitionWord;
import edu.ariane.gof.model.DefinitionWordRepository;
import edu.ariane.gof.service.DefinitionService;
import edu.ariane.gof.service.DictionaryService;

@Service
public class DefinitionServiceImpl implements DefinitionService {

	@Autowired
	private DefinitionWordRepository definitionRepository;
	@Autowired
	private DictionaryService dictionaryService;
	@Override
	public DefinitionWord buscarPalavra(String word) {
		DefinitionWord palavraRecebida = dictionaryService.consultarPalavra(word);
		//Optional<DefinitionWord> definition = definitionRepository.findById(word);
		return palavraRecebida;
	}

}
