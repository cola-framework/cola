/*
 * Copyright 2002-${Year} the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cola.service.cart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * cola
 * Created by jiachen.shi on 6/23/2016.
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class WebApplicationRunner {

    private static Logger logger = LoggerFactory.getLogger(WebApplicationRunner.class);

    public static void main(String[] args) {
        logger.info("**************** WebApplication Cola-OMS Start *****************");
        SpringApplication.run(WebApplicationRunner.class, args);
        logger.info("**************** WebApplication Cola-OMS End ******************");
    }

}
