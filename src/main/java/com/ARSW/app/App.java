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
public class App{
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
