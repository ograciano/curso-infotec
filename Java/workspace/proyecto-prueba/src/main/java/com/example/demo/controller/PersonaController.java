package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DataDTO;
import com.example.demo.service.PersonaService;

@RestController
public class PersonaController {
	
	@Autowired
	public PersonaService personaService;
	
	@PostMapping("/guardar")
	public ResponseEntity<Integer> guardarPersona(@RequestBody DataDTO data) {
		Integer id = 0;
		try {
			id = this.personaService.guardarPersona(data.getNombre(), data.getApellidos());
			
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
		if(id == 0) return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		return new ResponseEntity<Integer>(id, HttpStatus.CREATED);
	}
	
	@GetMapping("/personas/{id}")
	public ResponseEntity<DataDTO> obtenerPersona(@PathVariable("id") Integer id) {
		
		return new ResponseEntity<DataDTO>(new DataDTO(this.personaService.obtenerPorId(id)), HttpStatus.OK);
	}
}
