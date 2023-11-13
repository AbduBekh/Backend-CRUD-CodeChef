package com.codechef.newBackEnd;

import  org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


@SpringBootApplication
public class NewBackEndApplication {
	public static void main(String[] args) {
		SpringApplication.run(NewBackEndApplication.class, args);
		System.out.println("My app is running on");
        /*  try(Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@//codd.inf.unideb.hu:1521/ora21cp.inf.unideb.hu")) {
            System.out.println("connection.isValid(0) = "+ connection.isValid(0));
        } catch (SQLException e) {
            e.printStackTrace();
        }*/
	}
}
