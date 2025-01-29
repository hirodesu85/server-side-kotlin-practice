package com.example.spring_helloworld

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringHelloworldApplication

fun main(args: Array<String>) {
	runApplication<SpringHelloworldApplication>(*args)
}
