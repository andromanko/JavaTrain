package ita;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RtestApplication.class, args);
	System.out.println("Miau!");
	Cat cat = new Cat(); //обычнейший кнструктор
	cat.setName("Tom");
	cat.setAge(10);
	}

}
