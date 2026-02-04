package com.gevernova.service;

import com.gevernova.entity.Greeting;
import java.util.List;

public interface GreetingService {

    // create and save greeting message
    Greeting getGreeting(String firstName, String lastName);

    // fetch greeting by id
    Greeting findById(int id);

    // fetch all greetings
    List<Greeting> findAll();

    // update greeting message by id
    Greeting update(int id, String message);

    // delete greeting by id
    void delete(int id);
}
