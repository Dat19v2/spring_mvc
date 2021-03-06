package dk.kea.spring_mvc.service;

import dk.kea.spring_mvc.model.Animal;
import dk.kea.spring_mvc.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    public List<Animal> readAll(){
        List<Animal> animals = new ArrayList<>();
        for (Animal animal:animalRepository.readAll()){
            animals.add(animal);
        }

        return animals;
    }

    public void create(Animal animal){
        animalRepository.create(animal);
    }

    public boolean update(Animal animal){

        boolean updateOK = animalRepository.update(animal);
        return updateOK;
    }

    public Animal read(long id){
        return animalRepository.read(id);
    }

    public boolean delete(Long id){
        return animalRepository.delete(id);
    }

}
