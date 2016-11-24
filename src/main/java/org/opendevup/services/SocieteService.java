package org.opendevup.services;

import java.util.List;

import org.opendevup.dao.SocieteRepository;
import org.opendevup.entities.Societe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SocieteService {
	@Autowired
	private  SocieteRepository societeRepository;
	
	@RequestMapping("/saveSociete")
	public Societe save(Societe s){
		return societeRepository.save(s);
	}
	@RequestMapping("/allSocietes")
	public List<Societe> listSociete(){
		return societeRepository.findAll();
	}

	@RequestMapping("/societesParPage")
	public Page<Societe> societesPage(int page, int size){
		return societeRepository.findAll(new PageRequest(page, size));
	}
	
	@RequestMapping("/societesParMC")
	public Page<Societe> societesParMC(String mc,int page, int size){
		return societeRepository.societesParMC("%"+mc+"%",new PageRequest(page, size));
	}
	
	@RequestMapping("/getSociete/{id}")
	public Societe getsociete(@PathVariable("id")String id){
		return societeRepository.findOne(id);
	}
}
