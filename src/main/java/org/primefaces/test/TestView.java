package org.primefaces.test;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import lombok.Data;

@Data
@Named
@ViewScoped
public class TestView implements Serializable {

    private String string;
    private Integer integer;
    private BigDecimal decimal;
    private LocalDateTime localDateTime;

    private List<Animal> animalList;

    @PostConstruct
    public void init() {
        string = "Welcome to PrimeFaces!!";

        animalList = Arrays.asList(
                new Animal("Tiger", "Max", "White"),
                new Animal("Elephant", "Nellie", "Pink"),
                new Animal("Bear", "Balloo", "Brown")
        );
    }

    public List<Animal> acAnimal() {
        return new ArrayList<Animal>();
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }

    public void setAnimalList(List<Animal> animalList) {
        this.animalList = animalList;
    }

}
