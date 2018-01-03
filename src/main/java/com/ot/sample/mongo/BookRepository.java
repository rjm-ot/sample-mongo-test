package com.ot.sample.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, String> {

    public Book findByTitle(String title);

}
