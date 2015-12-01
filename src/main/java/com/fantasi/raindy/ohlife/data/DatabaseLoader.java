package com.fantasi.raindy.ohlife.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class DatabaseLoader implements CommandLineRunner {

	private final NoteRepository repository;

	@Autowired
	public DatabaseLoader(NoteRepository repository) {
		this.repository = repository;
	}

	@Override
	public void run(String... strings) throws Exception {
//		System.out.println("1234");
		
//		this.repository.save(new Note("Frodo", "Baggins", "ring bearer"));
	}
}
