package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {

		LombokTest lmt = new LombokTest();
		lmt.setData("Hello");
		String data = lmt.getData();

		System.out.println("data = " + data);


		SpringApplication.run(JpashopApplication.class, args);
	}

}
