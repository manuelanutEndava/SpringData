package org.example;

public class Parrot {
    private String name;

//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "Parrot{" +
//                "name='" + name + '\'' +
//                '}';
//    }

    //changes to test if the Spring creates only once the Bean

    public Parrot(){
        System.out.println("Parrot created");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
