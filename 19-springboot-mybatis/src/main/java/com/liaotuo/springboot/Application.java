package com.liaotuo.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    private final CityMapper cityMapper;

    public Application(CityMapper cityMapper) {
        this.cityMapper = cityMapper;
    }

    @Bean
    CommandLineRunner sampleCommandLineRunner() {
        return args -> {
            City city = new City();
            city.setName("San Francisco");
            city.setState("CA");
            city.setCountry("US");
            cityMapper.insert(city);
            System.out.println(this.cityMapper.findById(city.getId()));
        };
    }
}
