package com.checklistbr.checklist.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.checklistbr.checklist.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Marua", "maria@gmail.com", "9999999", "123456");
		return ResponseEntity.ok().body(u);
	}
	
//	public ResponseEntity<String> findAll(){
//		String teste = "PQP Deu certo dfdfdf";
//		return ResponseEntity.ok(teste);
//	}
}
