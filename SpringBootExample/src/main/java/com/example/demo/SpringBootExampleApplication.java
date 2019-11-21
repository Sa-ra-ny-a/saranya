package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

@SpringBootApplication
public class SpringBootExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExampleApplication.class, args);
		System.out.println("hii");
		openHomePage();
	}
	private static void openHomePage() {
		System.out.println("Browser");
		String url="http://localhost:8084/admin";
		if(Desktop.isDesktopSupported()) {
			Desktop desktop=Desktop.getDesktop();
			try {
				desktop.browse(new URI(url));
				
			}catch(IOException | URISyntaxException e) {
				e.printStackTrace();
			
			}
		}else {
			Runtime runtime=Runtime.getRuntime();
			try {
				runtime.exec("rundll32 url.dll,FileProtocolHandler" +url);
				
			}catch(IOException e) {
				e.printStackTrace();
			
			}
		}
	}

}
