package edu.ariane.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import edu.ariane.gof.model.DefinitionWord;

/**
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCEP</b>.
 * 
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @author falvojr
 */
@FeignClient(name = "dictionaryapi", url = "https://api.dictionaryapi.dev/api/v2/entries/en")
public interface DictionaryService {

	@GetMapping("/{word}")
	DefinitionWord consultarPalavra(@PathVariable("word") String word);
}
