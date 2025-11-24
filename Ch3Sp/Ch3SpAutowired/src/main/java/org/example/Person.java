package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name="Ella";

//    private final Parrot parrot;
    private Parrot parrot;

//    @Autowired
//    private Parrot parrot;

    //modification so Parrot can be final
//    @Autowired
//    public Person(Parrot parrot){
//        this.parrot=parrot;
//    }

//modification to sutowire on setter
@Autowired
public void setParrot(Parrot parrot){
    this.parrot=parrot;
}

    public void setName(String name) {
        this.name = name;
    }

    public Parrot getParrot() {
        return parrot;
    }

    public String getName() {
        return name;
    }

//    public void setParrot(Parrot parrot) {
//        this.parrot = parrot;
//    }
}
