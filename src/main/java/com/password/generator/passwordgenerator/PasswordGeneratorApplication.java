package com.password.generator.passwordgenerator;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    import java.util.Scanner;

@SpringBootApplication
public class PasswordGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasswordGeneratorApplication.class, args);

        Generator gen = new Generator();

        Scanner s = new Scanner(System.in);
        System.out.println("How many characters?: ");
        gen.generatePassword(s.nextInt());

    }

}
