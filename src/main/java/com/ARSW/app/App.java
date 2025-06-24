package com.ARSW.app;


import java.net.StandardSocketOptions;
import java.util.Scanner;
import com.ARSW.app.adapter.ChatGptAdapter;
import com.ARSW.app.adapter.IAiAdapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App implements CommandLineRunner {
    @Autowired
    private IAiAdapter chatAdapter;
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conversación iniciada con ChatGPT. Escriba 'SALIR' para terminar el chat.");

        while (true) {
            System.out.print("Escribe: ");
            String pregunta = scanner.nextLine();

            if ("SALIR".equals(pregunta)) {
                System.out.println("Chat terminado, adiós.");
                break;
            }

            String respuesta = chatAdapter.generateResponse(pregunta);
            System.out.println("ChatGPT: " + respuesta);
        }
    }
}
