package com.gevernova.repository;

import com.gevernova.entity.Greeting;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public class GreetingRepository {

    private Map<Integer, Greeting> map = new HashMap<>();
    private int counter = 1;

    // save new greeting
    public Greeting save(String message) {
        Greeting greeting = new Greeting(counter++, message);
        map.put(greeting.getId(), greeting);
        return greeting;
    }

    // find greeting by id
    public Greeting findById(int id) {
        return map.get(id);
    }

    // return all greetings
    public List<Greeting> findAll() {
        return new ArrayList<>(map.values());
    }

    // update greeting by id
    public Greeting update(int id, String message) {
        Greeting g = map.get(id);
        if (g != null) {
            g.setMessage(message);
        }
        return g;
    }

    // delete greeting by id
    public void delete(int id) {
        map.remove(id);
    }
}
