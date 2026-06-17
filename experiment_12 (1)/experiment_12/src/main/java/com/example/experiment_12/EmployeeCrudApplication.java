package com.example.experiment_12;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EmployeeCrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeeCrudApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(EmployeeRepository repo) {
        return (args) -> {
            System.out.println("\n========== Employee CRUD Application Started ==========");
            System.out.println("API Endpoints:");
            System.out.println("POST   /employees - Add new employee");
            System.out.println("GET    /employees - Get all employees");
            System.out.println("GET    /employees/{id} - Get employee by ID");
            System.out.println("PUT    /employees - Update employee");
            System.out.println("DELETE /employees/{id} - Delete employee");
            System.out.println("H2 Console: http://localhost:8080/h2-console");
            System.out.println("=========================================================\n");
        };
    }
}