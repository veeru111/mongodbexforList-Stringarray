package com.app.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.app.model.Book;

public interface Mongorepo extends MongoRepository<Book, String> {}
