package edu.ariane.gof.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;
import javax.annotation.Generated;

/**
 * Os atributos desse modelo foram gerados automaticamente pelo site
 * jsonschema2pojo.org. Para isso, usamos o JSON de retorno da API do ViaCEP.
 * 
 * @see <a href="https://www.jsonschema2pojo.org">jsonschema2pojo.org</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 * 
 * @author falvojr
 */

@Generated("jsonschema2pojo")
@Entity
public class DefinitionWord {

	@Id
	private String word;
	private String definition;
	private String example;
	//private List<Object> synonyms;
	//private List<Object> antonyms;
	
	public String getWord() {
	return word;
	}
	
	public void setWord(String word) {
	this.word = word;
	}
	public String getDefinition() {
	return definition;
	}
	
	public void setDefinition(String definition) {
	this.definition = definition;
	}
	
	public String getExample() {
	return example;
	}
	
	public void setExample(String example) {
	this.example = example;
	}
	/*
	public List<Object> getSynonyms() {
	return synonyms;
	}
	
	public void setSynonyms(List<Object> synonyms) {
	this.synonyms = synonyms;
	}
	
	public List<Object> getAntonyms() {
	return antonyms;
	}
	
	public void setAntonyms(List<Object> antonyms) {
	this.antonyms = antonyms;
	}
	*/
}
