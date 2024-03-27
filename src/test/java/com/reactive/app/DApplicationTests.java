package com.reactive.app;

import java.time.Duration;

import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.util.function.Tuple2;
import reactor.util.function.Tuple3;

@SpringBootTest
class DApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void workingWithMono() throws InterruptedException {
// 		Mono<String>errorMono=Mono.error(new RuntimeException("Error !!"));
// 		Mono<String>m1=Mono.
// 		just("Learn code with Naeem")
// .log()
// .then(errorMono);
		
// 		m1.subscribe(System.out::println);
		//errorMono.subscribe(System.out::println);


		Mono<String>m1=Mono.just("Learn Code with Naeem").delayElement(Duration.ofSeconds(2));
		
		Mono<String>m2=Mono.just("Subscribe to this channel");
		
		Mono<Integer>m3=Mono.just(21345);


		// Mono<String>resultMapMono=m1.map(String::toUpperCase);
		// resultMapMono.subscribe(System.out::println);

		// Mono<String[]>resultFlatExample=m1.flatMap(valueM1->Mono.just(valueM1.split(" ")));
		// resultFlatExample.subscribe(data->{
		// 	for(String s:data){
		// 		System.out.println(s);
		// 	}
		// });
		// System.out.println("------------------");
		
		//        Flux<String> stringFlux = m1.flatMapMany(valueM1 -> Flux.just(valueM1.split(" "))).log();
		//        stringFlux.subscribe(data->{
		//            System.out.println(data);
		//        });


// 		Mono<Tuple3<String,String,Integer>>combinedMono=Mono.zip(m1, m2,m3);

// combinedMono.subscribe(data->{
// 	System.out.println(data.getT1());
// 	System.out.println(data.getT2());
// 	System.out.println(data.getT3());
// });
// 		Mono<Tuple2<String,String>>zipWithMono=m1.zipWith(m2);

// zipWithMono.subscribe(data->{
// 	System.out.println(data.getT1());
// 	System.out.println(data.getT2());
// });


// Flux<String> stringFlux = m1.concatWith(m2)
//                .log()
//                .delayElements(Duration.ofMillis(2000));
//        stringFlux.subscribe(System.out::println);

	  
// System.out.println(Thread.currentThread().getName());
//        Flux<String> stringFlux = m1.concatWith(m2)
//                .log()
//                .delayElements(Duration.ofMillis(2000));

//        stringFlux.subscribe((data)->{
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(data);
//        });

//        Thread.sleep(4000);
//        System.out.println("terminated main thread");

m1.subscribe(data -> {

	System.out.println(Thread.currentThread().getName());
	System.out.println(data);
});
Thread.sleep(3000);

	}

}
