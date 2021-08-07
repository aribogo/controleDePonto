package com.dio.live.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dio.live.model.JornadaTrabalho;
import com.dio.live.repository.JornadaRepository;

@Service
public class JornadaService {
	

	JornadaRepository jornadaRepository;
	
	@Autowired
	public JornadaService(JornadaRepository jornadaRepository) {
		this.jornadaRepository = jornadaRepository;
	}
	
	public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}

	public List<JornadaTrabalho> findAll() {
		return jornadaRepository.findAll();
	
	}

	public Optional<JornadaTrabalho> getByID(Long idJornada) {
		return jornadaRepository.findById(idJornada);
	}
	
	public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho) {
		return jornadaRepository.save(jornadaTrabalho);
	}
	public void deleteJornadaByID(Long idJornada) {
		jornadaRepository.deleteById(idJornada);
	}
}
