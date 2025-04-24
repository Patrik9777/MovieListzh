/**
 * This package contains the main application files for FilmApp.
 */
package com.example.filmapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main application class for FilmApp.
 */
@SpringBootApplication
public class FilmAppApplication {

    /**
     * Private constructor to prevent instantiation of this utility class.
     */
    private FilmAppApplication() {
        throw new UnsupportedOperationException("Utility class");
    }

    /**
     * A main method that serves as the entry point for the application.
     *
     * @param args the command-line arguments
     */
    public static void main(final String[] args) {
        SpringApplication.run(FilmAppApplication.class, args);
    }
}
