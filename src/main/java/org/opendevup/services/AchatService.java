package org.opendevup.services;

import java.util.List;

import org.opendevup.dao.AchatRepository;
import org.opendevup.entities.Achat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AchatService {

	@Autowired
	private  AchatRepository achatRepository;
	
	@RequestMapping("/saveAchat")
	public Achat saveAchat(Achat a){
		return achatRepository.save(a);
	}
	
	@RequestMapping("/allAchats")
	public List<Achat> listAchat(){
		return achatRepository.findAll();
	}
	
	@RequestMapping("/AchatsParPage")
	public Page<Achat> achatsPage(int page, int size){
		return achatRepository.findAll(new PageRequest(page, size));
	}
	
	@RequestMapping("/getAchat/{id}")
	public Achat getAchat(@PathVariable("id")Long id){
		return achatRepository.findOne(id);
	}
	
}
