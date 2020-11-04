package org.solent.com504.factoryandfacade.impl;

import org.solent.com504.factoryandfacade.impl.AnimalObjectFactory;
import org.solent.com504.factoryandfacade.model.Animal;
import org.solent.com504.factoryandfacade.model.Cat;
import org.solent.com504.factoryandfacade.model.Cow;
import org.solent.com504.factoryandfacade.model.Dog;
import org.solent.com504.factoryandfacade.model.FarmFacade;

import java.util.ArrayList;
import java.util.List;

public class FarmFacadeImpl implements FarmFacade {
    private ArrayList<Animal> animals = new ArrayList<Animal>();
    
    public List<Animal> getAllAnimals(){
        return animals;
    }

    public void addCat(String name) {
        Animal cat = new Cat();
        cat.setName(name);
        animals.add(cat);
    }

    public void addCow(String name) {
        Animal cow = new Cow();
        cow.setName(name);
        animals.add(cow);
    }
    
    public void addDog(String name) {
        Animal dog = new Dog();
        dog.setName(name);
        animals.add(dog);
    }
}
