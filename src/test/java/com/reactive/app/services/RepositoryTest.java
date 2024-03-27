package com.reactive.app.services;

import com.reactive.app.entities.Book;
import com.reactive.app.repositories.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

@SpringBootTest
public class RepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    public void findMethodTest() {

        // Mono<Book> nameMono = bookRepository.findByName("Next book");
        // StepVerifier.create(nameMono)
        // .expectNextCount(1)
        // .verifyComplete();

//         Flux<Book> authorFlux = bookRepository.findByAuthor("Naeem");
//         StepVerifier.create(authorFlux)
//                 .expectNextCount(1)
//                 .verifyComplete();

        bookRepository.findByNameAndAuthor("Next Book", "Naeem")
        .as(StepVerifier::create)
        .expectNextCount(1)
        .verifyComplete();

        }

        @Test
        public void queryMethodsTest() {
        
        // bookRepository.getAllBooksByAuthor("Basic Python Book","Python rocker")
        // .as(StepVerifier::create)
        // .expectNextCount(1)
        // .verifyComplete();

        bookRepository.searchBookByTitle("%front%")
        .as(StepVerifier::create)
        .expectNextCount(1)
        .verifyComplete();

    }

}
