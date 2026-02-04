package com.gevernova.controller;

import java.util.List;
import com.gevernova.entity.Greeting;
import com.gevernova.service.GreetingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingServiceImpl service;

    // returns greeting message
    @GetMapping
    public Greeting greeting(
            @RequestParam(required = false) String firstName,
            @RequestParam(required = false) String lastName) {
        return service.getGreeting(firstName, lastName);
    }

    // fetch greeting by id
    @GetMapping("/{id}")
    public Greeting getById(@PathVariable int id) {
        return service.findById(id);
    }

    // fetch all greetings
    @GetMapping("/all")
    public List<Greeting> getAll() {
        return service.findAll();
    }

    // update greeting message by id
    @PutMapping("/{id}")
    public Greeting update(
            @PathVariable int id,
            @RequestParam String message) {
        return service.update(id, message);
    }

    // delete greeting by id
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "Greeting deleted successfully";
    }
}
