package com.decafandmac.eurekaservicediscovery

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekaServiceDiscoveryApplication

fun main(args: Array<String>) {
	runApplication<EurekaServiceDiscoveryApplication>(*args)
}
