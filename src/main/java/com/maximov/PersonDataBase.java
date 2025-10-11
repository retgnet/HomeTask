package com.maximov;

import java.util.*;
import com.maximov.Position;


public class PersonDataBase {
    private final Map<Long, Person> map = new HashMap<>();
    private final static HashSet<Position> hashSetPosition = new HashSet<>();
    static{
        hashSetPosition.add(Position.MANAGER);
        hashSetPosition.add(Position.DIRECTOR);
        hashSetPosition.add(Position.BRANCH_DIRECTOR);
        hashSetPosition.add(Position.SENIOR_MANAGER);

    }

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
        return hashSetPosition.contains(person.getPosition());
    }
    public boolean isEmployee(Long id){
        return map.containsKey(id);
    }


}
