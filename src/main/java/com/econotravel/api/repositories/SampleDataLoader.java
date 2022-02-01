package com.econotravel.api.repositories;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
public class SampleDataLoader {


    private ExperienceRepository experienceRepository;

    @Autowired
    public SampleDataLoader(ExperienceRepository experienceRepository) {this.experienceRepository = experienceRepository; }

    @PostConstruct
    public void loadSampleData() {
        experienceRepository.saveAll(List.of(

        new Experience(1L,"Paseo en bicicleta por el Montseny",250.00, "5h"),
        new Experience(2L, "Descubre la costa en barco de vela", 280.00, "4h"),
        new Experience(3L, "Descubre la Barcelona Modernista de noche",200.00, "4h"),
        new Experience(4L,"Del huerto a la mesa", 145.00, "3h")

        ));
    }

}