package com.reactive.app.services;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

@SpringBootTest
public class FluxLearnTest {

    @Autowired
    private FluxLearnService fluxLearnService;

    @Test
    void filterExampleFlux() {

        Flux<String> filterFlux = fluxLearnService.filterExampleFlux();
        StepVerifier.create(filterFlux).expectNextCount(3).verifyComplete();

    }

    @Test
    void flatMapExample() {

        Flux<String> stringFlux = fluxLearnService.flatMapExample();
        StepVerifier.create(stringFlux)
                .expectNextCount(22)
                .verifyComplete();

    }

    @Test
    void transformExample() {
        Flux flux = fluxLearnService.transformExample();
        StepVerifier.create(flux)
                .expectNextCount(4)
                .verifyComplete();
    }

    @Test
    void ifExample() {

        Flux<String> stringFlux = fluxLearnService.ifExample(4);
        StepVerifier.create(stringFlux)
                .expectNextCount(3)
                .verifyComplete();

    }

    @Test
    void concatExample() {

        Flux<String> stringFlux = fluxLearnService.concatExample().log();
        StepVerifier.create(stringFlux).expectNextCount(6).verifyComplete();

    }

    @Test
    void mergeWithExample() {

        Flux<String> log = fluxLearnService.mergeWithExample().log();
        StepVerifier.create(log)
                .expectNextCount(6)
                .verifyComplete();
    }

    @Test
    void zipExample() {
        Flux<String> tuple2Flux = fluxLearnService.zipExample().log();
        StepVerifier.create(tuple2Flux).expectNextCount(4).verifyComplete();
    }

    @Test
    void sideEffectFlux() {
        fluxLearnService.sideEffectFlux().log().subscribe(System.out::println);
    }

}