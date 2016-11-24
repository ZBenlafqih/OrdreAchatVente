package org.opendevup.services;

import java.util.List;

import org.opendevup.dao.VenteRepository;
import org.opendevup.entities.Vente;
import org.opendevup.entities.Ordre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VenteService {

	@Autowired
	private  VenteRepository venteRepository;
	
	@RequestMapping("/saveVente")
	public Ordre saveVente(Vente a){
		return venteRepository.save(a);
	}
	
	@RequestMapping("/allVentes")
	public List<Vente> listVente(){
		return venteRepository.findAll();
	}
	
	@RequestMapping("/ventesParPage")
	public Page<Vente> ventesPage(int page, int size){
		return venteRepository.findAll(new PageRequest(page, size));
	}
	
	@RequestMapping("/getVente/{id}")
	public Vente getVente(@PathVariable("id")Long id){
		return venteRepository.findOne(id);
	}
	
}
