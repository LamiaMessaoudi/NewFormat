package com.algebra.viewFormat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.algebra.viewFormat.entities.View2;

@SpringBootApplication
public class ViewFormatApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViewFormatApplication.class, args);
		View2 v1 =new View2(1,"mm");
		System.out.println(v1);
	}

}
