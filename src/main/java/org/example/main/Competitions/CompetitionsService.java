package org.example.main.Competitions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompetitionsService {

    @Autowired
    private CompetitionsRepository competitionsRepository;

    public List<Competitions> competitionbyCountry(String country_name) {
       return competitionsRepository.findbyCountryName(country_name);
    }

    public List<String> getCountryNames() {
        return competitionsRepository.findCountryNames();
    }
}
