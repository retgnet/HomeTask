package com.maximov;

import java.util.*;
import com.maximov.Position;


public class PersonDataBase {
    private final Map<Long, Person> map = new HashMap<>();

    public void add(Person person){
        map.put(person.getId(), person);
    }
    public Person findById(Long id){
        if(map.containsKey(id)){
            return map.get(id);
        }
        return null;
    }
    public boolean isManager(Person person){
        return person.getPosition() == Position.MANAGER || person.getPosition() == Position.DIRECTOR || person.getPosition() == Position.BRANCH_DIRECTOR ||
                person.getPosition() == Position.SENIOR_MANAGER;
    }
    public boolean isEmployee(Long id){
        return map.containsKey(id);
    }


}
