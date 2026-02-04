package com.gevernova.service;

import com.gevernova.entity.Greeting;
import com.gevernova.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService {

    @Autowired
    private GreetingRepository repository;

    // create and save greeting message
    @Override
    public Greeting getGreeting(String firstName, String lastName) {
        String message;

        if (firstName != null && lastName != null) {
            message = "Hello " + firstName + " " + lastName;
        } else if (firstName != null) {
            message = "Hello " + firstName;
        } else if (lastName != null) {
            message = "Hello " + lastName;
        } else {
            message = "Hello World";
        }

        return repository.save(message);
    }

    // fetch greeting by id
    @Override
    public Greeting findById(int id) {
        return repository.findById(id);
    }

    // fetch all greetings
    @Override
    public List<Greeting> findAll() {
        return repository.findAll();
    }

    // update greeting message by id
    @Override
    public Greeting update(int id, String message) {
        return repository.update(id, message);
    }

    // delete greeting by id
    @Override
    public void delete(int id) {
        repository.delete(id);
    }
}
