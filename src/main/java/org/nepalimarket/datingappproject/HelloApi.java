package org.nepalimarket.datingappproject;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class HelloApi {

    @GetMapping("/hello")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> helloApi() {
        String message = """
                <h2>Welcome to the Hello API!</h2>
                <p>Here's a short to-do list for dating app:</p>
                <ol>
                   <li>Create user registration and login functionality.</li>
                   <li>Integrate Facebook API for social media features.</li>
                   <li>Implement a matching algorithm for potential matches.</li>
                   <li>Design and implement user profiles and profile management.</li>
                   <li>Create a messaging system for matched users.</li>
                </ol>
                <p>customize and expand this list based on  project requirements!</p>
                """;

        return new ResponseEntity<>(message, HttpStatus.OK);
    }


}