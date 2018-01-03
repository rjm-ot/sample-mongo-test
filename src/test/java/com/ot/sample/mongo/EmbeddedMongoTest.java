package com.ot.sample.mongo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@DataMongoTest
public class EmbeddedMongoTest {

    @Autowired
    private MongoTemplate mongoTemplate;

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void simpleQueryTest(){
        assertNotNull(mongoTemplate);
       List<Customer> customers = mongoTemplate.findAll(Customer.class);
       assertNotNull(customers);
    }
    @Test
    public void bookQueryTest(){
        assertNotNull(mongoTemplate);
        List<Book> books = mongoTemplate.findAll(Book.class);
        assertNotNull(books);
    }

    @Test
    public void bookRepoTest(){
        assertNotNull(bookRepository);
        bookRepository.insert(new Book("bob's burger","this is a description"));
        List<Book> books = bookRepository.findAll();
        assertNotNull(books);
        assertEquals(1,books.size());
    }
}