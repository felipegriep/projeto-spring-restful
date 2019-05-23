package com.griep.projetospringrestful;

import com.griep.projetospringrestful.utils.SenhaUtils;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjetoSpringRestfulApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjetoSpringRestfulApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            String senhaEncoded = SenhaUtils.gerarBCrypt("123456");
            System.out.println("Senha encodada: " + senhaEncoded);
            senhaEncoded = SenhaUtils.gerarBCrypt("123456");
            System.out.println("Senha encodada novamente: " + senhaEncoded);

            boolean senhaValida = SenhaUtils.senhaValida("123456", senhaEncoded);
            System.out.println("Senha Válida: " + senhaValida);
        };
    }

}
