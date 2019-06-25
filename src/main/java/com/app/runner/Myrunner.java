package com.app.runner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Book;
import com.app.repo.Mongorepo;
@Component
public class Myrunner implements CommandLineRunner {
	@Autowired
	private Mongorepo repo;
	
	@Override
	public void run(String... args) throws Exception {

			repo.deleteAll();
			//repo.save(new Book("veera","raju",34.2));
			
			
			repo.save(new Book("raju","tagore",52.62,Arrays.asList("a","b","b"),new String[] {"c","d"}));
			
			Map<String,String> m=new HashMap<>();
			Properties p=new Properties();
			m.put("hari", "Name");m.put("ramu", "author");
			p.put("veera", "veera123");p.put("rani", "rani852251");
			
		repo.save(new Book("bookName", "i dontKnow", 8545.52, m, p));
			
		System.out.println("finish");
	}

}
